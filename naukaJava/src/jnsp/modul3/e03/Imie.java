package jnsp.modul3.e03;

import java.util.Scanner;

public class Imie {
    public static void main(String[] args) {

        String name;
        String lastName;
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jak masz na imię? ");
        name = scanner.nextLine();

        System.out.println("Jak masz na nazwisko? ");
        lastName = scanner.nextLine();

        System.out.println("Ile masz lat? ");
        age = scanner.nextInt();

        System.out.println("Imie: " + name);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Wiek: " + age);
    }
}