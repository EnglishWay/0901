package com.example.englishway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

import java.io.IOException;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        String quizLevel = "";

        try {
            Bundle bundle = this.getIntent().getExtras();
            quizLevel = bundle.getString("QUIZ_LEVEL");
        } catch (Exception obj) {
            Toast.makeText(this, "錯誤", Toast.LENGTH_SHORT).show();
        }

        MyDBOpenHelper db;
        db = new MyDBOpenHelper(this);
        try {
            db.createDB();
        } catch (IOException ioe) {
            throw new Error("Database not created....");
        }
        try {
            db.openDB();
        } catch (SQLException sqle) {
            throw sqle;
        }

        SQLiteDatabase db1;
        db1 = openOrCreateDatabase("Words", Context.MODE_PRIVATE, null);
    }
}