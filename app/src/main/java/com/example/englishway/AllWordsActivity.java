package com.example.englishway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
<<<<<<< Updated upstream
=======
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
>>>>>>> Stashed changes
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllWordsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allwords);

        ListView listView = (ListView) this.findViewById(R.id.word_info);

        List<initdate> list = new ArrayList<>();
        String selectedTable = "";

        try {
            Bundle bundle = this.getIntent().getExtras();
            selectedTable = bundle.getString("ONCLICK");
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
        Cursor c;
        switch (selectedTable) {
            case "Words1200":
                c = db1.rawQuery("SELECT * FROM Words1200", null);
                break;
            case "Words7000":
                c = db1.rawQuery("SELECT * FROM Words7000", null);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + selectedTable);
        }
        c.moveToFirst();

        //獲取表資料
        while (!c.isAfterLast()) {
            list.add(new initdate(c.getString(c.getColumnIndex("_word")), c.getString(c.getColumnIndex("_intpn"))));

            c.moveToNext();
        }

        //將獲取到的資料通過一個迴圈存放到map物件中
        List<HashMap<String, Object>> data = new ArrayList<HashMap<String, Object>>();
        for (int i = 0; i < list.size(); i++) {
            HashMap<String, Object> item = new HashMap<String, Object>();
            item.put("word", list.get(i).word);
            item.put("meaning1", list.get(i).intpn);
            data.add(item);
        }
        //建立SimpleAdapter介面卡將資料繫結到item顯示控制元件上
        SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.word_info,
                new String[]{"word", "meaning1"}, new int[]{R.id.word, R.id.intpn});
        //實現列表的顯示
        listView.setAdapter(adapter);
<<<<<<< Updated upstream
=======


//        Button searchButton = findViewById(R.id.search_button);
//        searchButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                search();
//            }
//        });
>>>>>>> Stashed changes
    }
//    private void search() {
//
//        EditText search = findViewById(R.id.edit_text);
//        String input = search.getText().toString().trim();
//        SQLiteDatabase db = SQLiteDatabase.openOrCreateDatabase("Words.db", null);
//        Cursor cursor ;
//        switch (selectedTable) {
//            case "Words1200":
//                cursor = db.rawQuery("SELECT * FROM Words1200 WHERE _word like ?",new String[]{"%"+input+"%"});
//                break;
//            case "Words7000":
//                cursor = db.rawQuery("SELECT * FROM Words7000 WHERE _word like ?",new String[]{"%"+input+"%"});
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + selectedTable);
//        }
//        cursor.moveToFirst();
//
//        List<initdate> list = new ArrayList<>();
//        while (!cursor.isAfterLast()) {
//            list.add(new initdate(cursor.getInt(cursor.getColumnIndex("_id")),cursor.getString(cursor.getColumnIndex("_word")), cursor.getString(cursor.getColumnIndex("_intpn")),cursor.getInt(cursor.getColumnIndex("_star"))));
//
//            cursor.moveToNext();
//        }
//
//        List<HashMap<String, Object>> data = new ArrayList<HashMap<String, Object>>();
//        for (int i = 0; i < list.size(); i++) {
//            HashMap<String, Object> item = new HashMap<String, Object>();
//            item.put("id", list.get(i).id);
//            item.put("word", list.get(i).word);
//            item.put("intpn", list.get(i).intpn);
//            data.add(item);
//        }
//
//        SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.word_info,
//                new String[]{"word", "intpn"}, new int[]{R.id.word, R.id.intpn});
//        //實現列表的顯示
//        listView.setAdapter(adapter);
//    }



}