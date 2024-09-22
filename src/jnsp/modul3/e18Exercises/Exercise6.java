package jnsp.modul3.e18Exercises;

import java.util.Scanner;
public class Exercise6 {
    public static boolean czyLiczbaPierwsza(int liczba) {
        if (liczba <= 1) {
            return false;
        } else if (liczba == 2) {
            return true;
        } else if (liczba % 2 == 0) {
            return false;
        } else {
            int pierwiastek = (int) Math.sqrt(liczba) + 1;

            for (int dzielnik = 3; dzielnik < pierwiastek; dzielnik += 2) {
                if (liczba % dzielnik == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /*              Metoda powyżęj skopiowana z ChatGPT     */


    public static void main(String[] args) {

        int scope;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj przedział: " );

        scope= scanner.nextInt();

        for(int i=0; i<scope; i++){
            if(czyLiczbaPierwsza(i)){
                System.out.println(i + " to liczba pierwsza");
            }
        }


    }
}
