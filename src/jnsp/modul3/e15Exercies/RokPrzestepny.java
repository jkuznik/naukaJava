package jnsp.modul3.e15Exercies;

import java.util.Scanner;

public class RokPrzestepny {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int year;

        System.out.println("Podaj rok do którego mają być sprawdzone wszystkie lata przestępne: ");
        number = scanner.nextInt();

        for(int i=0; i<number; i++) {
            year = i;

            if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)) {
                if (year > 2023) {
                    System.out.println(year + " bedzie rokiem przestepnym");
                } else {
                    System.out.println(year + " był rokiem przestepnym");
                }
            } else {
                // System.out.println(year + " to nie rok przestepny");
            }
        }
    }
}
