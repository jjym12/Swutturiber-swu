package jiyou.swu.swutturiber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class StarbucksListActivity extends AppCompatActivity {
        private RecyclerView recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starbucks_list);


        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        List<ExpandableListAdapter.Item> data = new ArrayList<>();

        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "콜드 브루 커피"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "돌체 콜드 브루"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "바닐라 크림 콜드 브루"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "콜드 브루"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "나이트로 바닐라 크림"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "나이트로 쇼콜라 클라우드"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "에스프레소"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "에스프레소"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "아이스 아메리카노"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "아이스 카페라떼"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "아이스 카푸치노"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "아이스 카페 모카"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "아이스 카라멜 마끼야또"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "아이스 화이트 초콜릿 모카"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "푸드"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "클래식 스콘"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "딸기 앙모스"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "하트 파이"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "초콜릿 롤링 크루아상"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "서머 베리 요거트 케이크"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "크레이프 치즈 케이크"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "블루베리 쿠키 치즈 케이크"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "호두 당근 케이크"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "파인 땡큐 샌드위치"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "바비큐 풀드 포크 샌드위치"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "햄&루꼴라 올리브 샌드위치"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "바비큐 치킨 치즈 치아비타"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "B.E.L.T. 샌드위치"));
        data.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "로스트 치킨 샐러드 밀 박스"));

        ExpandableListAdapter.Item places = new ExpandableListAdapter.Item(ExpandableListAdapter.HEADER, "프라푸치노");
        places.invisibleChildren = new ArrayList<>();
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "자바 칩 프라푸치노"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "블랙 와플칩 크림 프라푸치노"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "더블 에스프레소 칩 프라푸치노"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "초콜릿 크림 칩 프라푸치노"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "화이트 딸기 크림 프라푸치노"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "화이트 초콜릿 모카 프라푸치노"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "모카 프라푸치노"));
        places.invisibleChildren.add(new ExpandableListAdapter.Item(ExpandableListAdapter.CHILD, "카라멜 프라푸치노"));

        data.add(places);

        recyclerview.setAdapter(new ExpandableListAdapter(data));
    }
    }
