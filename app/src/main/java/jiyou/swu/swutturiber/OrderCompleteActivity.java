package jiyou.swu.swutturiber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderCompleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_complete);

        Button buttonAccept=(Button)findViewById(R.id.buttonAccept2);

        buttonAccept.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent acceptIntent=new Intent(OrderCompleteActivity.this, MainActivity.class);
                startActivity(acceptIntent);
            }
        });
    }
}
