package jiyou.swu.swutturiber;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

@SuppressWarnings("deprecation")

public class MainDeliveryActivity extends AppCompatActivity {
static public String cafe, drink, location, addDrink, time, cal, price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_delivery);

        ArrayList<SampleData> dataList;


        dataList=new ArrayList<SampleData>();


        ListView listView = (ListView)findViewById(R.id.listview);
        final MyAdapter myAdapter = new MyAdapter(this,dataList);

        dataList.add(new SampleData(cafe, drink, location, addDrink,time,cal,price));
        dataList.add(new SampleData("스타벅스", "돌체라떼(ice)","제2과학관","휘핑/", "10시 40분","계좌이체","4800원"));
        dataList.add(new SampleData("가은", "아메리카노(hot)","50주년기념관","샷/얼음컵","2시 45분","현금","3500원"));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView parent, View v, int position, long id){
                Intent deliverIntent1=new Intent(MainDeliveryActivity.this, DeliveryAcceptActivity.class);
                startActivity(deliverIntent1);
            }

        });

        listView.setAdapter(myAdapter);

    }
}
