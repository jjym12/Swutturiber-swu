package jiyou.swu.swutturiber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderCompleteActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_complete2);

        Button buttonAccept=(Button)findViewById(R.id.buttonAccept3);

        buttonAccept.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent acceptIntent=new Intent(OrderCompleteActivity2.this, MainDeliveryActivity.class);
                startActivity(acceptIntent);
                finish();
            }
        });


    }
}
