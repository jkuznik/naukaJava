package jnsp.modul3.e18Exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        int value1=0;
        int value2=1;
        int value3=0;
        int scope;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj zakres ciągu Fibonacciego: ");
        scope = scanner.nextInt();

        for(int i=1; i<=scope; i++){

            if(value3==0) System.out.println(0 + "   " + value3);

            value1 = value2;
            value2 = value3;
            value3 = value2 + value1;

            System.out.println(i + "   " + value3);

        }
    }
}
