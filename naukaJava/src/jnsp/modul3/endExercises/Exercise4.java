package jnsp.modul3.endExercises;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        String country;
        String capitol;
        String choice;

        boolean exit=true;

        HashMap<String, String> capitolsList = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        capitolsList.put("Polska", "Warszawa");
        capitolsList.put("Niemcy", "Berlin");
        capitolsList.put("Czechy", "Praga");
        capitolsList.put("Francja", "Paryż");
        capitolsList.put("Hiszpania", "Madryt");

        System.out.println("Stolice państw");

        do {
            System.out.println("Podaj nazwę państwa dla którego ma zostać wyświetlona stolica:");
            country = scanner.nextLine();

            if (capitolsList.get(country) != null) {
                System.out.println(capitolsList.get(country));

                System.out.println("Wyjdź z programu (T/N)");
                choice = scanner.nextLine();
                if (!choice.equals("T") && !choice.equals("N")) System.out.println("Zły format wyboru");
                if (choice.equals("T")) exit = false;

            } else {
                System.out.println("Brak informacji o danym państwie - czy chcesz dodać? (T/N)");
                choice = scanner.nextLine();

                switch (choice) {

                    case "T" -> {
                        System.out.println("Podaj stolice państwa " + country);
                        capitol = scanner.nextLine();
                        capitolsList.put(country, capitol);
                    }

                    case "N" -> {
                        System.out.println("Wyjdź z programu (T/N)");
                        choice = scanner.nextLine();
                        if (choice.equals("T")) exit = false;
                    }

                    default -> System.out.println("Zły format wyboru");

                }
            }

        }while(exit);

    }
}
