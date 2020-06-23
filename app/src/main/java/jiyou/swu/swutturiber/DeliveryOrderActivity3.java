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

public class DeliveryOrderActivity3 extends AppCompatActivity {
    static public String cafe, drink, location, addDrink, time, cal, price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_order3);

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

        Button deliveryComleteButton=(Button)findViewById(R.id.buttonDeliveryComplete);

        deliveryComleteButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent deliveryIntent=new Intent(DeliveryOrderActivity3.this, DeliveryOrderActivity4.class);
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

//                textView.setText(message);
            }

            DeliveryOrderActivity3.GPSListener2 gpsListener = new DeliveryOrderActivity3.GPSListener2();
            long minTime = 10000;
            float minDistance = 0;

            manager.requestLocationUpdates(
                    LocationManager.GPS_PROVIDER,
                    minTime, minDistance, gpsListener);

//            Toast.makeText(getApplicationContext(), "내 위치확인 요청함",Toast.LENGTH_SHORT).show();

        } catch(SecurityException e) {
            e.printStackTrace();
        }
    }

    class GPSListener2 implements LocationListener {
        //음료 배달 지점
        double endLatitude = 37.323019;
        double endLongitude = 127.096919;

        public void onLocationChanged(Location location) {
            LocationManager manager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
            Double latitude = location.getLatitude();
            Double longitude = location.getLongitude();

            String message = "내 위치 -> Latitude : "+ latitude + "\nLongitude:"+ longitude;
//            textView.setText(message);

            double distance = getDistance(latitude, longitude, endLatitude, endLongitude);

            String messagedistance = "남은 거리 = "+distance;

//            textView.setText(messagedistance);
            if (distance <= 20){
                manager.removeUpdates(this);
                //여기가 화면 전환 부분 임당!
                Intent deliveryIntent=new Intent(DeliveryOrderActivity3.this, DeliveryOrderActivity4.class);
                startActivity(deliveryIntent);
                finish();
//                txtResultLocation.setText("배달 도착!");
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
