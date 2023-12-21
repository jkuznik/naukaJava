package jnsp.modul3.e16Kalkulator;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        double number1;
        double number2;
        int choose;

        String select;

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Podaj pierwszą liczbę: ");
            number1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Podaj działanie do wykonania [+][-][*][/][%][sqrt][^]: ");
            select = scanner.nextLine();

            switch (select) {

                case "+" -> {
                    System.out.println("Podaj drugą liczbę :");
                    number2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                }

                case "-" -> {
                    System.out.println("Podaj drugą liczbę :");
                    number2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                }

                case "*" -> {
                    System.out.println("Podaj drugą liczbę :");
                    number2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                }

                case "/" -> {
                    System.out.println("Podaj drugą liczbę :");
                    number2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                }

                case "%" -> {
                    System.out.println("Podaj drugą liczbę :");
                    number2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
                }

                case "sqrt" -> System.out.println("^/``` " + number1 + " = " + Math.sqrt(number1));


                case "^" -> {
                    System.out.println("Do której potęgi :");
                    number2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(number1 + " ^ " + number2 + " = " + Math.pow(number1, number2));
                }

                default -> System.out.println("Nie rozpoznano operacji.");

            }

            System.out.println("1 - Licz jeszcze raz");
            System.out.println("2 - Wyjście");
            choose = scanner.nextInt();
            scanner.nextLine();

        } while (choose != 2);          // jeżeli jest prawdą to pętla wykona się jeszcze raz

    }
}