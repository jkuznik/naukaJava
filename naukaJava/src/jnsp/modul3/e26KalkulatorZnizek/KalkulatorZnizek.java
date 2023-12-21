package jnsp.modul3.e26KalkulatorZnizek;

import java.util.Scanner;

public class KalkulatorZnizek {
    public static void main(String[] args) {

        int price;
        int promotion;
        double finalPrice;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj cenę produktu: ");
        price = scanner.nextInt();

        System.out.println("Podaj jaką zniżkę posiadasz w procentach: ");
        promotion = scanner.nextInt();

        price *= 100;
        promotion = 100 - promotion;
        finalPrice = (double) price * (double) promotion;
        finalPrice /= 10000;

        System.out.println(finalPrice);
    }
}
