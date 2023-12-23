package jnsp.modul4.e29Exercises.exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month;
        Scanner scanner = new Scanner(System.in);

        Months[] monthsDays = Months.values();

        System.out.println("Który miesiąc Cię interesuje: [1-12]");
        month = scanner.nextInt();
        scanner.nextLine();

        System.out.println(monthsDays[month-1] + " ma " + monthsDays[month-1].getDays() + " dni");

    }
}
