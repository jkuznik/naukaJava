package jnsp.modul3.e05;

import java.util.Scanner;

public class Operatory {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c;

        System.out.println("A = \t" + a);
        System.out.println("B = \t" + b);

        c = a + b;

        System.out.println("Dodawanie: \t" + c);

        c = a * b;

        System.out.println("Mnożenie: \t" + c);

        c = a / b;

        System.out.println("Dzielenie: \t" + c);

        c = b / a;

        System.out.println("Dzielenie b/a: \t" + c);

        c = b % a;

        System.out.println("Modulo b%a: \t" + c);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n\t\t\t Kalkulator");
        System.out.println("Pierwsza liczba: ");
        int number1 = scanner.nextInt();

        System.out.println("Druga liczba: ");
        int number2 = scanner.nextInt();

        System.out.println();
        System.out.println("Wynik dodawania \t" + number1 + " + " + number2 + " = " + (number1+number2));
        System.out.println("Wynik odejmowania \t" + number1 + " - " + number2 + " = " + (number1-number2));
        System.out.println("Wynik mnożenia  \t" + number1 + " * " + number2 + " = " + (number1*number2));
        System.out.println("Wynik dzielenia \t" + number1 + " / " + number2 + " = " + (number1/number2));
        System.out.println("Wynik modulo    \t" + number1 + " % " + number2 + " = " + (number1%number2));

//        double a = 10;
//        double b = 5;
//        double c;
//
//        System.out.println("A = \t" + a);
//        System.out.println("B = \t" + b);
//
//        c = a + b;
//
//        System.out.println("Dodawanie: \t" + c);
//
//        c = a * b;
//
//        System.out.println("Mnożenie: \t" + c);
//
//        c = a / b;
//
//        System.out.println("Dzielenie: \t" + c);
//
//        c = b / a;
//
//        System.out.println("Dzielenie b/a: \t" + c);
//
//        c = b % a;
//
//        System.out.println("Modulo b%a: \t" + c);

    }
}
