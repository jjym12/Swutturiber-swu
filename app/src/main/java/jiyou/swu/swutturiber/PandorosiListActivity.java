package jiyou.swu.swutturiber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PandorosiListActivity extends AppCompatActivity {
        private RecyclerView recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pandorosi_list);

        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<ExpandableListAdapter.Item> data = new ArrayList<>();

        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "COFFEE"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "에스프레소"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "아메리카노"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "달달 아메리카노"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "카페라떼"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "달달 카페라떼"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "BEVERAGE"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "초콜릿"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "화이트 초코"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "민트 초코"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "스토로베리 라떼"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "그린티 라떼"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "허니 고구마 라떼"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "곡물 라떼"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "FOOD"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "쿠키"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "크림 치즈 프레즐"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "베이글 + 크림치즈"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "머핀"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "커피번"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "치즈번"));

        ExpandableListAdapter.Item places = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "Frappe");
        places.invisibleChildren = new ArrayList<>();
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "모카 프라페"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "카라멜 프라페"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "민트초코 프라페"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "자바칩 프라페"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "그린티 프라페"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "요거트 프라페"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "피치 요거트 프라페"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "블루베리 요거트 프라페"));

        data.add(places);

        recyclerview.setAdapter(new ExpandableListAdapter(data));
    }
}
