package jnsp.modul3.e18Exercises;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        int number1;
        int number2;
        int value=1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj podstawę: ");
        number1 = scanner.nextInt();

        System.out.println("Podaj wykładnik: ");
        number2 = scanner.nextInt();

        for(int i=0; i<number2; i++){

            value *= number1;
        }

        System.out.println("Wynik to " + value);
    }
}
