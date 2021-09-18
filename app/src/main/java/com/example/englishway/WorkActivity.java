package com.example.englishway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

    private Button button_back, work_1, work_2, work_3, work_4, work_5, work_6, work_7, work_8, work_9, work_10;

    private void initViews(){
        button_back = (Button)findViewById(R.id.button_back);
        work_1 = (Button)findViewById(R.id.work_1);
        work_2 = (Button)findViewById(R.id.work_2);
        work_3 = (Button)findViewById(R.id.work_3);
        work_4 = (Button)findViewById(R.id.work_4);
        work_5 = (Button)findViewById(R.id.work_5);
        work_6 = (Button)findViewById(R.id.work_6);
        work_7 = (Button)findViewById(R.id.work_7);
        work_8 = (Button)findViewById(R.id.work_8);
        work_9 = (Button)findViewById(R.id.work_9);
        work_10 = (Button)findViewById(R.id.work_10);
    }
    private void setListeners(){

        button_back.setOnClickListener(backtoMain);
        work_1.setOnClickListener(startQuiz);work_2.setOnClickListener(startQuiz);work_3.setOnClickListener(startQuiz);
        work_4.setOnClickListener(startQuiz);work_5.setOnClickListener(startQuiz);work_6.setOnClickListener(startQuiz);
        work_7.setOnClickListener(startQuiz);work_8.setOnClickListener(startQuiz);work_9.setOnClickListener(startQuiz);
        work_10.setOnClickListener(startQuiz);
    }

    private View.OnClickListener backtoMain = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            WorkActivity.this.finish();
        }
    };

    private View.OnClickListener startQuiz = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(WorkActivity.this, QuizActivity.class);
            Bundle bundle = new Bundle();
            switch (v.getId()){
                case R.id.work_1:
                    bundle.putString("QUIZ_LEVEL", "1");
                    break;
                case R.id.work_2:
                    bundle.putString("QUIZ_LEVEL", "2");
                    break;
                case R.id.work_3:
                    bundle.putString("QUIZ_LEVEL", "3");
                    break;
                case R.id.work_4:
                    bundle.putString("QUIZ_LEVEL", "4");
                    break;
                case R.id.work_5:
                    bundle.putString("QUIZ_LEVEL", "5");
                    break;
                case R.id.work_6:
                    bundle.putString("QUIZ_LEVEL", "6");
                    break;
                case R.id.work_7:
                    bundle.putString("QUIZ_LEVEL", "7");
                    break;
                case R.id.work_8:
                    bundle.putString("QUIZ_LEVEL", "8");
                    break;
                case R.id.work_9:
                    bundle.putString("QUIZ_LEVEL", "9");
                    break;
                case R.id.work_10:
                    bundle.putString("QUIZ_LEVEL", "10");
                    break;
            }
            intent.putExtras(bundle);
            startActivity(intent);
        }
    };
}