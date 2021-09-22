package com.example.englishway;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class FeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        //取得控制項物件
        initViews();
        //顯示寵物
        showResults();
        //設定監聽事件
        setListeners();
    }


    private ImageButton button_1;
    private ImageButton button_2;
    private ImageButton button_3;

    private void initViews() {


        button_1 = findViewById(R.id.button1);
        button_2 = findViewById(R.id.button2);
        button_3 = findViewById(R.id.button3);
    }

    private void setListeners() {
        button_1.setOnClickListener(itemOnclick);
        button_2.setOnClickListener(itemOnclick);
        button_3.setOnClickListener(itemOnclick);
    }

    private void showResults() {
//        try {
//            Bundle bundle = this.getIntent().getExtras();
//            String petID = bundle.getString("PET_NAME");
//        } catch (Exception obj) {
//            Toast.makeText(this, "錯誤", Toast.LENGTH_SHORT).show();
//        }
    }

    private View.OnClickListener itemOnclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String item_name = "";
            switch (v.getId()) {
                case R.id.button1:
                    item_name = "飼料1，飽足度+10";
                    break;
                case R.id.button2:
                    item_name = "飼料2，飽足度+20";
                    break;
                case R.id.button3:
                    item_name = "飼料3，飽足度+30";
                    break;
            }
            Toast.makeText(FeedActivity.this,item_name,Toast.LENGTH_SHORT).show();
        }
    };
}