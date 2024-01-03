package sumaTon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int zmiana1;
        int zmiana2;
        int zmiana3;

        int tor9;
        int tor10;
        int tor11;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wagony - tor 9: ");
        tor9 = scanner.nextInt();

        System.out.println("Wagony - tor 10: ");
        tor10 = scanner.nextInt();

        System.out.println("Wagony - tor 11: ");
        tor11 = scanner.nextInt();

        System.out.println("Zmiana 1 suma ton: ");
        zmiana1 = scanner.nextInt();

        System.out.println("Zmiana 2 suma ton: ");
        zmiana2 = scanner.nextInt();

        zmiana3 = ((tor9 + tor10) * 52) + (tor11 * 46);

        System.out.println();
        System.out.println("\t\t Zmiana 1 :" + zmiana1);
        System.out.println("\t\t Zmiana 2 :" + zmiana2);
        System.out.println("\t\t Zmiana 3 :" + zmiana3);
        System.out.println("Zmiana3 \ttor9: " + tor9 + " tony " + (tor9*52));
        System.out.println("Zmiana3 \ttor10: " + tor10 + " tony " + (tor10*52));
        System.out.println("Zmiana3 \ttor11: " + tor11 + " tony " + (tor11*46));
        System.out.println("\t Razem :" + (zmiana1+zmiana2+zmiana3));

    }
}
