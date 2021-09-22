package com.example.EnglishWay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet);
        //取得控制項物件
        initViews();
        //顯示寵物
        showResults();
        //設定監聽事件
        setListeners();
    }

    private TextView pet_name;
    private Button button_feed;
    private Button button_evolve;
    private Button button_earn;

    private void initViews() {
        pet_name = findViewById(R.id.textView);
        button_feed = findViewById(R.id.button_feed);
        button_evolve = findViewById(R.id.button_evolve);
        button_earn = findViewById(R.id.button_earn);
    }

    private void setListeners() {
        button_feed.setOnClickListener(feedPet);
    }

    private void showResults() {
        try {
            Bundle bundle = this.getIntent().getExtras();
            String petID = bundle.getString("ONCLICK_PET");
            pet_name.setText(petID);
        } catch (Exception obj) {
            Toast.makeText(this, "錯誤", Toast.LENGTH_SHORT).show();
        }

    }

    private View.OnClickListener feedPet = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("PET_NAME",pet_name.getText().toString());
            intent.setClass(PetActivity.this, FeedActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    };

}