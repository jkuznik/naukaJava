package jnsp.modul3.endExercises;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Exercise2 {        // dopisać wyświetlanie w kolejności od najwiekszej do najmniejszej
    public static void main(String[] args) {

        String text;
        String letter;
        int value=1;

        HashMap<String, Integer> letters = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz tekst: ");
        text = scanner.nextLine();
        text = text.strip().replace(" ","");

        for(int i=0; i<text.length(); i++){
            letter = "" + text.charAt(i);

            if(letters.containsKey(letter)){
                value = letters.get(letter) + 1;
                letters.put(letter, value);
            } else letters.put(letter, value);

            value=1;
        }

        Set<String> keys = letters.keySet();

        for(String key : keys){
            System.out.println("Litera " + key + " występuje " + letters.get(key));
        }

    }
}
