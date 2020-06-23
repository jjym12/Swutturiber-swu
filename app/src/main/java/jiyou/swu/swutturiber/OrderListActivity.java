package jiyou.swu.swutturiber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class OrderListActivity extends AppCompatActivity {
    TextView cafeText, drinkText, totalText;
    int total = 2500;
    String drink = "(hot)",addShot = "", addWhipping= "", addIcecup="", pay="현금";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list);

        cafeText = (TextView) findViewById(R.id.cafeText);
        drinkText = (TextView) findViewById(R.id.drinkText);
        totalText = (TextView) findViewById(R.id.totalText);
        Button orderButton = (Button) findViewById(R.id.orderButton);
        final CheckBox shotCB = (CheckBox) findViewById(R.id.shotCB);
        final CheckBox whippingCB = (CheckBox) findViewById(R.id.whippingCB);
        final CheckBox icecupCB = (CheckBox) findViewById(R.id.icecupCB);
        RadioGroup rg1 = (RadioGroup) findViewById(R.id.rGroup1);
        RadioGroup rg2 = (RadioGroup) findViewById(R.id.rGroup2);
        final EditText edtDestination = (EditText) findViewById(R.id.edtDestination);
        final EditText edthour = (EditText) findViewById(R.id.edthour);
        final EditText edtminutes = (EditText) findViewById(R.id.edtminutes);
        final EditText numberEdit = (EditText) findViewById(R.id.numberEdit);

        Intent intent = getIntent();
        final String name = intent.getExtras().getString("name");
        final String cafe = intent.getExtras().getString("cafe");
        drinkText.setText(name);
        cafeText.setText(cafe);
        totalText.setText(String.valueOf(total));

        //주문 음료 부분 라디오 버튼
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.hotRB) {
                    total -= 300;
                    totalText.setText(String.valueOf(total));
                    drink = "(hot)";
                }
                else if (checkedId == R.id.coldRB) {
                    total += 300;
                    totalText.setText(String.valueOf(total));
                    drink = "(cold)";
                }
            }
        });
        //추가 부분 체크박스
        shotCB.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (shotCB.isChecked()) {
                    total += 500;
                    addShot = "샷/";
                    totalText.setText(String.valueOf(total));
                } else {
                    total -= 500;
                    addShot = "";
                    totalText.setText(String.valueOf(total));
                }
            }
        });
        whippingCB.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (whippingCB.isChecked()) {
                    total += 500;
                    addWhipping = "휘핑/";
                    totalText.setText(String.valueOf(total));
                } else {
                    total -= 500;
                    addWhipping="";
                    totalText.setText(String.valueOf(total));
                }
            }
        });
        icecupCB.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (icecupCB.isChecked()) {
                    total += 500;
                    addIcecup="얼음컵";
                    totalText.setText(String.valueOf(total));
                } else {
                    total -= 500;
                    addIcecup = "";
                    totalText.setText(String.valueOf(total));
                }
            }
        });
        //현금 or 계좌
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.cashRB) {
                    pay = "현금";
                } else if (checkedId == R.id.accountRB) {
                    pay = "계좌이체";
                }
            }
        });

        orderButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                MainDeliveryActivity.cafe = cafe;
                MainDeliveryActivity.drink = name+drink;
                DeliveryAcceptActivity.cafe = cafe;
                DeliveryAcceptActivity.drink = name+drink;
                DeliveryOrderActivity.cafe = cafe;
                DeliveryOrderActivity.drink = name+drink;
                DeliveryOrderActivity2.cafe = cafe;
                DeliveryOrderActivity2.drink = name+drink;
                DeliveryOrderActivity3.cafe = cafe;
                DeliveryOrderActivity3.drink = name+drink;
                DeliveryOrderActivity4.cafe = cafe;
                DeliveryOrderActivity4.drink = name+drink;

                MainDeliveryActivity.location = edtDestination.getText().toString();
                MainDeliveryActivity.addDrink = addShot+addWhipping+addIcecup;
                MainDeliveryActivity.time = edthour.getText().toString() + "시 " + edtminutes.getText().toString() + "분";
                MainDeliveryActivity.cal = pay;
                MainDeliveryActivity.price = total + "원";

                DeliveryAcceptActivity.location = edtDestination.getText().toString();
                DeliveryAcceptActivity.addDrink = addShot+addWhipping+addIcecup;
                DeliveryAcceptActivity.time = edthour.getText().toString() + "시 " + edtminutes.getText().toString() + "분";
                DeliveryAcceptActivity.cal = pay;
                DeliveryAcceptActivity.price = total + "원";

                //1
                DeliveryOrderActivity.location = edtDestination.getText().toString();
                DeliveryOrderActivity.addDrink = addShot+addWhipping+addIcecup;
                DeliveryOrderActivity.time = edthour.getText().toString() + "시 " + edtminutes.getText().toString() + "분";
                DeliveryOrderActivity.cal = pay;
                DeliveryOrderActivity.price = total + "원";

                //2
                DeliveryOrderActivity2.location = edtDestination.getText().toString();
                DeliveryOrderActivity2.addDrink = addShot+addWhipping+addIcecup;
                DeliveryOrderActivity2.time = edthour.getText().toString() + "시 " + edtminutes.getText().toString() + "분";
                DeliveryOrderActivity2.cal = pay;
                DeliveryOrderActivity2.price = total + "원";

                //3
                DeliveryOrderActivity3.location = edtDestination.getText().toString();
                DeliveryOrderActivity3.addDrink = addShot+addWhipping+addIcecup;
                DeliveryOrderActivity3.time = edthour.getText().toString() + "시 " + edtminutes.getText().toString() + "분";
                DeliveryOrderActivity3.cal = pay;
                DeliveryOrderActivity3.price = total + "원";

                //4
                DeliveryOrderActivity4.location = edtDestination.getText().toString();
                DeliveryOrderActivity4.addDrink = addShot+addWhipping+addIcecup;
                DeliveryOrderActivity4.time = edthour.getText().toString() + "시 " + edtminutes.getText().toString() + "분";
                DeliveryOrderActivity4.cal = pay;
                DeliveryOrderActivity4.price = total + "원";

                Intent orderIntent = new Intent(OrderListActivity.this, OrderCompleteActivity2.class);
                startActivity(orderIntent);
                finish();
            }
        });
    }
}
