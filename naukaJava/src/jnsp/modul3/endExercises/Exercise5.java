package jnsp.modul3.endExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        String name;
        int index=0;
        boolean flag = false;

        String choice;
        boolean exit = true;

        ArrayList<String> names = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        names.add("Łukasz");
        names.add("Karol");
        names.add("Daria");
        names.add("Agata");
        names.add("Klaudia");
        names.add("Jakub");
        names.add("Julia");
        names.add("Janusz");
        names.add("Robert");
        names.add("Karol");
        names.add("Klaudia");

        do {
            System.out.println("Podaj imię które chcesz wyszukać:");
            name = scanner.nextLine();

            index = 0;
            flag = false;

            for (String checkName : names) {
                if (name.equals(checkName)) {
                    System.out.println(name + " znajduje się na liście pod numerem " + index);
                    flag = true;
                }
                index++;
            }

            if(!flag) System.out.println("Podanego imienia nie ma na liście.");

            do {
                System.out.println("Czy chcesz wyszukać kolejne imie? [T/N]");
                choice = scanner.nextLine();
                if (choice.equals("N")) exit = false;
            }while (!choice.equals("T") && !choice.equals("N"));

        } while(exit);
    }
}
