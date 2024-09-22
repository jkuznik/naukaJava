package jnsp.modul3.e24Palindrom;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

        String text;
        ArrayList<String> letters = new ArrayList<>();
        String currentLetter;

        int textLength;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst: ");
        text = scanner.nextLine();

        text = text.replaceAll(" ", "").toUpperCase();

        textLength = text.length();

        for(int i=0; i<textLength; i++){    // Przypisanie wszystkich znaków tekstu od końca do początku do ArrayListy


            currentLetter = "" + text.charAt(textLength-i-1);

//                              Powyżej /\ przypisanie typu 'char' do typu 'string'

            letters.add(currentLetter);

        }

        textLength = letters.size();

        for(int i=0; i<textLength/2 ; i++){

            if( ! (letters.get(i).equals (letters.get(textLength-i-1) ) )) {
                System.out.println("Nie zgadza się.");
                break;

            } else if( i == textLength/2 - 1){
                System.out.println("Palindrom");
            }
        }
    }
}
