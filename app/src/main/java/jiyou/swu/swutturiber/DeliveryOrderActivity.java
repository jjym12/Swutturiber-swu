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

public class DeliveryOrderActivity extends AppCompatActivity {
static public String cafe, drink, location, addDrink, time, cal, price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_order);

        Button deliveryCompleteButton= (Button)findViewById(R.id.buttonDeliveryComplete);
        TextView cafeText=(TextView)findViewById(R.id.cafe);
        TextView drinkText=(TextView)findViewById(R.id.drink);
        TextView locationText=(TextView)findViewById(R.id.location);
        TextView addText = (TextView)findViewById(R.id.add);
        TextView timeText = (TextView)findViewById(R.id.time);
        TextView calText = (TextView)findViewById(R.id.cal);
        TextView priceText = (TextView)findViewById(R.id.price);

        cafeText.setText(cafe);
        drinkText.setText(drink);
        locationText.setText(location);
        addText.setText(addDrink);
        timeText.setText(time);
        calText.setText(cal);
        priceText.setText(price);


        deliveryCompleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deliveryIntent=new Intent(DeliveryOrderActivity.this, DeliveryOrderActivity2.class);
                startActivity(deliveryIntent);
                finish();
            }
        });
        AutoPermissions.Companion.loadAllPermissions(this, 101);
    }

}
