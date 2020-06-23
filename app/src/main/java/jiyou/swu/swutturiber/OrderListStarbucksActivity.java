package jiyou.swu.swutturiber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderListStarbucksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list_starbucks);

        Button orderButton=(Button)findViewById(R.id.orderButton);

        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent orderIntent=new Intent(OrderListStarbucksActivity.this, OrderCompleteActivity2.class);
                startActivity(orderIntent);
            }
        });
    }
}
