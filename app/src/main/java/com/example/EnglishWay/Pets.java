package com.example.EnglishWay;

public class Pets {
    String name; //寵物名
    int hunger; //飽足感
    int evolve; //進化次數


    public Pets(String n) {
        name = n;
        hunger = 100;
        evolve = 0;
    }

    public void updateHunger() {

    }

    public void updateEvolve() {
        evolve += 1;
    }

    public int earnMoney() {
        /*
        int earned = 0;
        SharedPreferences record = Context.getSharedPreferences("record", MODE_PRIVATE);
        if (hunger <= 70) {
            return earned;
        }
        Date today = new Date(System.currentTimeMillis());
        String last = record.getString("Date", "錯誤：無法讀取上次日期");
        Date lastDate = DateFormat.parse(last);
        int x = lastDate.compareTo(today);
        earned+= (1+x)*10*x;
        return earned;

         */
        return 0;
    }
}
