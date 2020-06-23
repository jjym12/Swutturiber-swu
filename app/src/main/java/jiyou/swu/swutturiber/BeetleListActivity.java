package jiyou.swu.swutturiber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BeetleListActivity extends AppCompatActivity {
        private RecyclerView recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beetle_list);
        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<ExpandableListAdapter.Item> data = new ArrayList<>();

        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "Real Coffee"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "아메리카노"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "카페 라떼"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "카푸치노"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "바닐라 라떼"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "카페모카"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "Fruit Milk"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "바나나 우유"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "딸바유(딸기+바나나+우유)"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "키바유(키위+바나나+우유)"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "살구우유"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "홍시우유"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "블루베리우유"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "아보카도우유"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "Fruit"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "딸기 주스"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "키위 주스"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "토마토 주스"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "파인애플 주스"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "수박 주스"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "오렌지 주스"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "사과 주스"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "고구마 주스"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "블루베리 주스"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "자몽 주스"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "체리 주스"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "아보카도 주스"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "복분자 주스"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "무화과 주스"));

        ExpandableListAdapter.Item places = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "Fruit Mix");
        places.invisibleChildren = new ArrayList<>();
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "딸바 주스(딸기+바나나)"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "키바 주스(키위+바나나)"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "복자 주스(복숭아+자두)"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "토바 주스(토마토+바나나)"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "파키 주스(파인애플+키위)"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "키레 주스(키위+레몬)"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "오당 주스(오렌지+당근)"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "멜수 주스(멜론+수박)"));

        data.add(places);

        recyclerview.setAdapter(new ExpandableListAdapter(data));
    }
}
