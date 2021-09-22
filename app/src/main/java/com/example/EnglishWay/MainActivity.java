package com.example.EnglishWay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化資料
        initData();
        //取得控制項物件
        initViews();
        //設定監聽事件
        setListeners();
    }


    private Button button_work;
    private Button button_pet;
    private Button button_words;
    private Button button_shop;

    //取得控制項物件
    private void initViews() {
        button_work = findViewById(R.id.button_work);
        button_pet = findViewById(R.id.button_pet);
        button_words = findViewById(R.id.button_words);
        button_shop = findViewById(R.id.button_shop);
    }

    private void initData() {
    }

    //設定監聽事件
    private void setListeners() {
        button_work.setOnClickListener(clickWork);
        button_pet.setOnClickListener(clickPet);
        button_words.setOnClickListener(clickWords);
        button_shop.setOnClickListener(clickShop);
    }

    private View.OnClickListener clickWork = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, WorkActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener clickPet = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, PetsActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener clickWords = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, WordsActivity.class);
            startActivity(intent);
        }
    };

    private View.OnClickListener clickShop = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, ShopActivity.class);
            startActivity(intent);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

//    public void clickWords(View view) {
//        Intent intent = new Intent();
//        intent.setClass(MainActivity.this, WordsActivity.class);
//        startActivity(intent);
//    }

    //    public void clickShop(View view) {
//        Intent intent = new Intent();
//        intent.setClass(MainActivity.this, ShopActivity.class);
//        startActivity(intent);
//    }
}