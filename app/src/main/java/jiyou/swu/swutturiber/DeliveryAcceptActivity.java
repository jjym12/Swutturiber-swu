package jiyou.swu.swutturiber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pedro.library.AutoPermissions;

public class DeliveryAcceptActivity extends AppCompatActivity {
    static public String cafe, drink, location, addDrink, time, cal, price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_accept);

        Button buttonAccept= (Button)findViewById(R.id.buttonAccept);
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


        buttonAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deliveryIntent=new Intent(DeliveryAcceptActivity.this, DeliveryOrderActivity.class);
                startActivity(deliveryIntent);
                finish();
            }
        });
        AutoPermissions.Companion.loadAllPermissions(this, 101);
    }
}
