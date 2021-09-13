package com.example.englishway;

public class initdate {
    public String word;
    public String intpn;
    public boolean star;
    public initdate(String word, String intpn, int star){
        this.word = word;
        this.intpn = intpn;
        if(star == 1){this.star = true;}
        else {this.star = false;}
    }
}
