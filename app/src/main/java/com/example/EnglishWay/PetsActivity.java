package com.example.EnglishWay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
<<<<<<< Updated upstream
import android.widget.Button;
=======
import android.widget.ImageButton;
>>>>>>> Stashed changes

public class PetsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pets);
        //取得控制項物件
        initViews();
        //設定監聽事件
        setListeners();
    }

    private Button pet_1;
    private Button pet_2;
    private Button pet_3;
    private Button pet_4;
    private Button pet_5;
    private Button pet_6;

    private void initViews() {
        pet_1 = findViewById(R.id.pet_1);
        pet_2 = findViewById(R.id.pet_2);
        pet_3 = findViewById(R.id.pet_3);
        pet_4 = findViewById(R.id.pet_4);
        pet_5 = findViewById(R.id.pet_5);
        pet_6 = findViewById(R.id.pet_6);
    }

    private void setListeners() {
        pet_1.setOnClickListener(petOnclick);
        pet_2.setOnClickListener(petOnclick);
        pet_3.setOnClickListener(petOnclick);
        pet_4.setOnClickListener(petOnclick);
        pet_5.setOnClickListener(petOnclick);
        pet_6.setOnClickListener(petOnclick);
    }

    private View.OnClickListener petOnclick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.setClass(PetsActivity.this, PetActivity.class);
            Bundle bundle = new Bundle();
            switch (v.getId()){
                case R.id.pet_1:
                    bundle.putString("ONCLICK_PET", "寵物1");
                    break;
                case R.id.pet_2:
                    bundle.putString("ONCLICK_PET", "寵物2");
                    break;
                case R.id.pet_3:
                    bundle.putString("ONCLICK_PET", "寵物3");
                    break;
                case R.id.pet_4:
                    bundle.putString("ONCLICK_PET", "寵物4");
                    break;
                case R.id.pet_5:
                    bundle.putString("ONCLICK_PET", "寵物5");
                    break;
                case R.id.pet_6:
                    bundle.putString("ONCLICK_PET", "寵物6");
                    break;
            }
            intent.putExtras(bundle);
            startActivity(intent);
        }
    };

}