package jnsp.modul3.e18Exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        int scope;
        int value=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj zakres: ");
        scope = scanner.nextInt();

        for(int i =1; i<=scope; i++){
            value = value + i;
            System.out.println(i + "   " + value);
        }
    }
}
