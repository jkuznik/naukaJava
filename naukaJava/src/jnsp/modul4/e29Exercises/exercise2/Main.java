package jnsp.modul4.e29Exercises.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String text = "";
        List<String> words = new ArrayList<>();
        StringConcentrator stringConcentrator = new StringConcentrator();

        text = stringConcentrator.connectString("Jaś ", "Małgosia");
        System.out.println(text);
        System.out.println();

        text = stringConcentrator.connectString("Jaś ", "i ", "Małgosia");
        System.out.println(text);
        System.out.println();

        text = "";

        words.add("Siała "); words.add("baba "); words.add("mak, "); words.add("nie ");
        words.add("wiedziała "); words.add("jak"); words.add("... ");
        words.add("Dziadek "); words.add("wiedział "); words.add("nie "); words.add("powiedział, ");
        words.add("a "); words.add("to "); words.add("było "); words.add("tak... \n");

        for(int i=0; i<10; i++) {
            text = stringConcentrator.connectString(text, words);
        }

        System.out.println(text);
    }
}
