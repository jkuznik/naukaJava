package jnsp.modul4.e29Exercises.exercise2;

import java.util.List;

public class StringConcentrator {

    public String connectString(String text, String text2){
        return text + text2;
    }

    public String connectString(String text, String text2, String text3){
        return text + text2 + text3;
    }

    public String connectString(String text, List<String> text2){

        for(String word : text2){
            text += "" +  word;
        }
        return text;
    }
}