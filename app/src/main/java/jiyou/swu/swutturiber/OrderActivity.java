package jiyou.swu.swutturiber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        ImageView starbucks=(ImageView)findViewById(R.id.starbucks);
        ImageView pandorosi=(ImageView)findViewById(R.id.pandorosi);
        ImageView beetle=(ImageView)findViewById(R.id.beetlejuice);
        ImageView gaeun=(ImageView)findViewById(R.id.gaeun);

        //카페 로고 클릭 시 각각 해당하는 카페의 메뉴 리스트 창으로 이동

        starbucks.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent starbucksIntent=new Intent(OrderActivity.this, StarbucksListActivity.class);
                starbucksIntent.putExtra("cafe","스타벅스");
                startActivity(starbucksIntent);
            }
        });
        pandorosi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent pandorosiIntent=new Intent(OrderActivity.this, PandorosiListActivity.class);
                pandorosiIntent.putExtra("cafe","팬도로시");
                startActivity(pandorosiIntent);
            }
        });
        beetle.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent beetleIntent=new Intent(OrderActivity.this, BeetleListActivity.class);
                beetleIntent.putExtra("cafe","비틀주스");
                startActivity(beetleIntent);
            }
        });

        gaeun.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent gaeunIntent=new Intent(OrderActivity.this, gaeunListActivity.class);
                gaeunIntent.putExtra("cafe","가은");
                startActivity(gaeunIntent);
            }
        });
    }
}
