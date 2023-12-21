package jnsp.modul3.e15Exercies;

import java.util.Scanner;

public class NajwiekszaLiczba {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1;
        int number2;
        int number3;

        System.out.println("Podaj pierwsza liczbe: ");
        number1 = scanner.nextInt();

        System.out.println("Podaj drugą liczbe: ");
        number2 = scanner.nextInt();

        System.out.println("Podaj trzecią liczbe: ");
        number3 = scanner.nextInt();

        System.out.println("Podane liczby to " + number1 + " " + number2 + " " + number3);

        if(number1 > number2){
            if(number1 > number3){
                System.out.println("A najwieksza z nich to " + number1);
            } else { System.out.println("A najwieksza z nich to " + number3); }
        } else if ( number2 > number3){
            System.out.println("A najwieksza z nich to " + number2);
        } else { System.out.println("A najwieksza z nich to " + number3); }
    }
}
