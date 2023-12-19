package jnsp.modul3.e15;

import java.util.Scanner;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Podaj ilość zdobytych punktów: ");
        number = scanner.nextInt();

        if(number>=0 && number<60){
            System.out.println("Twoja ocena to 1, popraw się!");
        } else if(number>=60 && number<=69){
            System.out.println("Twoja ocena to 2, popraw ją");
        } else if(number>=70 && number<=79){
            System.out.println("Twoja ocena to 3");
        } else if(number>=80 && number<=89){
            System.out.println("Twoja ocena to 4");
        } else if(number>=90 && number<=100){
            System.out.println("Twoja ocena to 5, Gratulacje!");
        } else {
            System.out.println("Podałeś ilość punktow z poza zakresu lub w złym formacie,\n" +
                    " możliwe punkty do zdobycia z zakresu 0 -100");
        }
    }
}
