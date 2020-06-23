package jiyou.swu.swutturiber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DeliveryOrderActivity4 extends AppCompatActivity {
    static public String cafe, drink, location, addDrink, time, cal, price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_order4);

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

        //도착확인 클릭 시 음료 주문 완료 메시지 창
        deliveryCompleteButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent deliveryIntent=new Intent(DeliveryOrderActivity4.this, OrderCompleteActivity.class);
                startActivity(deliveryIntent);
            }
        });
    }
}
