package jiyou.swu.swutturiber;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.pedro.library.AutoPermissions;

public class DeliveryOrderActivity2 extends AppCompatActivity {
    static public String cafe, drink, location, addDrink, time, cal, price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_order2);

        TextView cafeText=(TextView)findViewById(R.id.textView15);
        TextView drinkText=(TextView)findViewById(R.id.textView9);
        TextView locationText=(TextView)findViewById(R.id.textView16);
        TextView addText = (TextView)findViewById(R.id.textView17);
        TextView timeText = (TextView)findViewById(R.id.textView10);
        TextView calText = (TextView)findViewById(R.id.cal);
        TextView priceText = (TextView)findViewById(R.id.textView8);

        cafeText.setText(cafe);
        drinkText.setText(drink);
        locationText.setText(location);
        addText.setText(addDrink);
        timeText.setText(time);
        calText.setText(cal);
        priceText.setText(price);

        Button deliveryCompleteButton=(Button)findViewById(R.id.buttonDeliveryComplete);

        deliveryCompleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deliveryIntent=new Intent(DeliveryOrderActivity2.this, DeliveryOrderActivity3.class);
                startActivity(deliveryIntent);
                finish();
            }
        });

        AutoPermissions.Companion.loadAllPermissions(this, 101);
        startLocationService();
    }
    public void startLocationService() {
        LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        try {
            Location location = manager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            if (location != null) {
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                String message = "최근 위치 -> Latitude : " + latitude + "\nLongitude:" + longitude;

//                txtLocation.setText(message);
            }

            DeliveryOrderActivity2.GPSListener gpsListener = new DeliveryOrderActivity2.GPSListener();
            long minTime = 10000;
            float minDistance = 0;

            manager.requestLocationUpdates(
                    LocationManager.GPS_PROVIDER,
                    minTime, minDistance, gpsListener);

//            Toast.makeText(getApplicationContext(), "내 위치확인 요청함", Toast.LENGTH_SHORT).show();

        } catch(SecurityException e) {
            e.printStackTrace();
        }
    }

    class GPSListener implements LocationListener {
        //음료 주문 지점
        double startLatitude = 37.323407;
        double srartLongitude = 127.095036;

        public void onLocationChanged(Location location) {
            LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            Double latitude = location.getLatitude();
            Double longitude = location.getLongitude();

            String message = "내 위치 -> Latitude : "+ latitude + "\nLongitude:"+ longitude;
//            txtLocation.setText(message);

            double distance = getDistance(startLatitude, srartLongitude, latitude, longitude);

            String messagedistance = "남은 거리 = "+distance;

//            txtLocation.setText(messagedistance);
            if (distance >= 30){
                //txtLocation.setText("픽업 완료!");
                //finish 해도 화면이 계속 업데이트 되어서 remove 코드 추가
                manager.removeUpdates(this);
                //여기가 화면 변경 부분입니다!
                Intent deliveryIntent=new Intent(DeliveryOrderActivity2.this, DeliveryOrderActivity3.class);
                startActivity(deliveryIntent);
                finish();



            }
        }

        public void onProviderDisabled(String provider) { }

        public void onProviderEnabled(String provider) { }

        public void onStatusChanged(String provider, int status, Bundle extras) { }
    }

    public double getDistance(double lat1 , double lng1 , double lat2 , double lng2 ){
        double distance;

        Location locationA = new Location("point A");
        locationA.setLatitude(lat1);
        locationA.setLongitude(lng1);

        Location locationB = new Location("point B");
        locationB.setLatitude(lat2);
        locationB.setLongitude(lng2);

        distance = locationA.distanceTo(locationB);

        return distance;
    }
}
