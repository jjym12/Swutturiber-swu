package jiyou.swu.swutturiber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pedro.library.AutoPermissions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView deliverImage=findViewById(R.id.deliverImage);
        TextView deliverText=findViewById(R.id.deliverText);
        ImageView orderImage=findViewById(R.id.orderImage);
        TextView orderText=findViewById(R.id.orderText);

        //배달하기 버튼이나 이미지 클릭 시 주문화면으로 이동
        deliverImage.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent deliverIntent1=new Intent(MainActivity.this, MainDeliveryActivity.class);
                startActivity(deliverIntent1);
            }
        });
        deliverText.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent deliverIntent2=new Intent(MainActivity.this, MainDeliveryActivity.class);
                startActivity(deliverIntent2);
            }
        });
        //주문하기 버튼이나 이미지 클릭 시 배달화면으로 이동
        orderImage.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent orderIntent1=new Intent(MainActivity.this, OrderActivity.class);
                startActivity(orderIntent1);
            }
        });
        orderText.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent orderIntent2=new Intent(MainActivity.this, OrderActivity.class);
                startActivity(orderIntent2);
            }
        });

        AutoPermissions.Companion.loadAllPermissions(this, 101);
    }
}
