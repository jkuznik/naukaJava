package jnsp.modul3.endExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        String name;
        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile będzie imion: ");
        number= scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<number; i++){
            System.out.println("Podaj imię: ");
            name = scanner.nextLine();

            names.add(name);
        }

        number =0;

        for(String checkName : names){
            if(checkName.endsWith("a")){
                number++;
            }
        }

        System.out.println("Podałeś " + number + " imion żeńskich oraz \n" +
                (names.size()-number) + " imion męskich");

    }
}
