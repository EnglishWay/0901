package com.example.englishway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
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

    private Button button_feed;
    private Button button_evolve;

    private void initViews() {
        button_feed = findViewById(R.id.button_feed);
        button_evolve = findViewById(R.id.button_evolve);
    }

    private void setListeners() {
        button_feed.setOnClickListener(feedPet);
    }

    private void showResults() {
        try {
            Bundle bundle = this.getIntent().getExtras();
            String petID = bundle.getString("ONCLICK_PET");
        } catch (Exception obj) {
            Toast.makeText(this, "錯誤", Toast.LENGTH_SHORT).show();
        }

    }

    private View.OnClickListener feedPet = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(PetActivity.this, FeedActivity.class);
            startActivity(intent);
        }
    };

}