package com.example.englishway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AllWordsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allwords);

        ListView listView = (ListView)this.findViewById(R.id.word_info);

        List<initdate>list = new ArrayList<>();

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
        Cursor c = db1.rawQuery("SELECT * FROM Words1200", null);

        c.moveToFirst();

        //獲取表資料
        while (!c.isAfterLast()) {
            list.add(new initdate(c.getString(c.getColumnIndex("_word")),c.getString(c.getColumnIndex("_intpn"))));

            c.moveToNext();
        }

        //將獲取到的資料通過一個迴圈存放到map物件中
        List<HashMap<String, Object>> data = new ArrayList<HashMap<String, Object>>();
        for(int i = 0; i < list.size(); i++){
            HashMap<String, Object>item = new HashMap<String, Object>();
            item.put("word", list.get(i).word);
            item.put("meaning1", list.get(i).intpn);
            data.add(item);
        }
        //建立SimpleAdapter介面卡將資料繫結到item顯示控制元件上
        SimpleAdapter adapter = new SimpleAdapter(this, data, R.layout.word_info,
                new String[]{"word", "meaning1"}, new int[]{R.id.word, R.id.intpn});
        //實現列表的顯示
        listView.setAdapter(adapter);
    }


}