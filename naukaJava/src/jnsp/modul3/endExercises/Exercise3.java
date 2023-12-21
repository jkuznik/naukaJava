package jnsp.modul3.endExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        String name;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wypełnianie pierwszej listy");

        for(int i=0; i<5; i++){
            System.out.println("Podaj imię: ");
            name = scanner.nextLine();
            list1.add(name);
        }
        System.out.println("Wypełnianie drugiej listy");

        for(int i=0; i<5; i++){
            System.out.println("Podaj imię: ");
            name = scanner.nextLine();
            list2.add(name);
        }

        for( String checkName : list1){
            for ( String checkName2 : list2){
                if(checkName2.equals(checkName)){
                    System.out.println(checkName2 + " występuje w obu listach");
                }
            }
        }



    }
}
