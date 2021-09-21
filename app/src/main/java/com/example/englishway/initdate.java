package com.example.englishway;

public class initdate {
    public int id;
    public String word;
    public String intpn;
    public boolean star;
    public initdate(int id, String word, String intpn, int star){
        this.id = id;
        this.word = word;
        this.intpn = intpn;
        if(star == 1){this.star = true;}
        else {this.star = false;}
    }
}
