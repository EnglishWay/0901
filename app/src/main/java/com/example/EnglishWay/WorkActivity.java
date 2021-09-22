package com.example.EnglishWay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);
        //取得控制項物件
        initViews();
        //設定監聽事件
        setListeners();
    }

    private Button button_back;

    private void initViews(){
        button_back = (Button)findViewById(R.id.button_back);
    }
    private void setListeners(){
        button_back.setOnClickListener(backtoMain);
    }

    private View.OnClickListener backtoMain = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            WorkActivity.this.finish();
        }
    };

}