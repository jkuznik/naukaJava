package jnsp.modul3.endExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        String name;
        String choice="Q";
        boolean flag;
        int index;
        String text= """
                1. Dodaj wpis       [1]
                2. Wyszukaj         [2]
                3. Usuń pozycję     [3]
                4. Wyświetl listę   [4]
                5. Wyjscie          [5]""";

        ArrayList<String> nameList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\tLista osób");

        do{
            System.out.println(text);
            choice = scanner.nextLine();

            switch(choice){
                case "1" ->{
                    System.out.println("Podaj imię które chcesz dodać: ");
                    name = scanner.nextLine();
                    nameList.add(name);
                }

                case "2" ->{
                    flag = false;
                    System.out.println("Podaj imię które chcesz wyszukać:");
                    name = scanner.nextLine();

                    if(nameList.contains(name)) flag = true;

                    if(flag) System.out.println(name + " jest na liście");
                    else System.out.println("Nie ma takiej osoby");

                }

                case "3" ->{
                    System.out.println("Podaj imię które chcesz usunąć z listy:");
                    name = scanner.nextLine();
                    flag = false;
                    do{
                        flag = false;
                        for(String currentName : nameList){
                            if(name.equals(currentName)) flag = true;
                        }

                        if(flag) nameList.remove(name);

                    }while(flag);

                }

                case "4" ->{
                    for(String currentName : nameList){
                        System.out.println(currentName);
                    }
                }

                case "5" ->{
                    break;
                }

                default -> System.out.println("Zły format wyboru");
            }

            System.out.println();

        }while(!choice.equals("5"));
    }
}
