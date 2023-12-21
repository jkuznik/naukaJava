package jnsp.modul3.e18Exercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        int scope1;
        int scope2;
        int evenValue=0;
        int notEvenValue=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj początek przedziału: ");
        scope1 = scanner.nextInt();

        System.out.println("Podaj koniec przedziału: ");
        scope2 = scanner.nextInt();

        for(int i=scope1; i<=scope2; i++){

            if(i%2==0) {
                evenValue += i;
            } else notEvenValue += i;
        }

        System.out.println("Suma licz parzystych z podanego przedziału to " + evenValue);
        System.out.println("Suma licz nie parzystych z podanego przedziału to " + notEvenValue);

    }
}
