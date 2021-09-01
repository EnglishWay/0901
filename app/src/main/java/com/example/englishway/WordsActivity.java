package com.example.englishway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WordsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        //取得控制項物件
        initViews();
        //設定監聽事件
        setListeners();
    }
    private Button button20;
    private Button button45;
    private Button button70;

    private void initViews(){
        button20 = (Button)findViewById(R.id.word2000);
        button45 = (Button)findViewById(R.id.word4500);
        button70 = (Button)findViewById(R.id.word7000);
    }
    private void setListeners(){
        button20.setOnClickListener(viewWords);
        button45.setOnClickListener(viewWords);
        button70.setOnClickListener(viewWords);
    }

    private View.OnClickListener viewWords = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(WordsActivity.this, AllWordsActivity.class);
            startActivity(intent);
        }
    };
}