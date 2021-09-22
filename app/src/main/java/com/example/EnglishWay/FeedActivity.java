package com.example.EnglishWay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
<<<<<<< Updated upstream
import android.widget.Button;
import android.widget.TextView;
=======
import android.widget.ImageButton;
>>>>>>> Stashed changes
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

    private TextView pet_name;
    private Button button_1;
    private Button button_2;

    private void initViews() {

        pet_name = findViewById(R.id.textView);
        button_1 = findViewById(R.id.button1);
        button_2 = findViewById(R.id.button2);
    }

    private void setListeners() {
        button_1.setOnClickListener(itemOnclick);
        button_2.setOnClickListener(itemOnclick);
    }

    private void showResults() {
        try {
            Bundle bundle = this.getIntent().getExtras();
            String petID = bundle.getString("PET_NAME");
            pet_name.setText(petID);
        } catch (Exception obj) {
            Toast.makeText(this, "錯誤", Toast.LENGTH_SHORT).show();
        }
    }

    private View.OnClickListener itemOnclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String item_name = "";
            switch (v.getId()) {
                case R.id.button1:
                    item_name = "道具1";
                    break;
                case R.id.button2:
                    item_name = "道具2";
                    break;
            }
            Toast.makeText(FeedActivity.this,item_name,Toast.LENGTH_SHORT).show();
        }
    };
}