package jnsp.modul3.endExercises;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        String name;
        int index;
        int size;

        ArrayList<String> nameList1 = new ArrayList<>();
        ArrayList<String> nameList2 = new ArrayList<>();

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.println("Podaj imię: ");
            name = scanner.nextLine();
            nameList1.add(name);
        }

        System.out.println("Lista przed wymieszaniem :");
        for(String currentName : nameList1){
            System.out.println(currentName);
        }

        size = nameList1.size();
        for(int i=0; i<size; i++){
            index = random.nextInt(nameList1.size());
            nameList2.add(nameList1.get(index));
            nameList1.remove(index);
        }

        System.out.println("Lista po wymieszaniu");
        for(String currentName : nameList2){
            System.out.println(currentName);
        }


    }
}
