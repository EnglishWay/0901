package com.example.englishway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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
    private Button button70;
    private Button buttonStars;

    private void initViews(){
        button20 = (Button)findViewById(R.id.word2000);
        button70 = (Button)findViewById(R.id.word7000);
        buttonStars = (Button)findViewById(R.id.word_star);
    }
    private void setListeners(){
        button20.setOnClickListener(viewWords);
        button70.setOnClickListener(viewWords);
    }

    private View.OnClickListener viewWords = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(WordsActivity.this, AllWordsActivity.class);
            Bundle bundle = new Bundle();
            switch (v.getId()){
                case R.id.word2000:
                    bundle.putString("ONCLICK", "Words1200");
                    break;
                case R.id.word7000:
                    bundle.putString("ONCLICK", "Words7000");
                    break;
                case R.id.word_star:
                    bundle.putString("ONCLICK","WordsStar");
                    break;
            }
            intent.putExtras(bundle);
            startActivity(intent);
        }
    };
}