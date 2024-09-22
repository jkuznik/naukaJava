package jnsp.modul3.e18Exercises;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        
        int scope;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj zakres: ");
        scope = scanner.nextInt();

        for(int i=0; i<scope; i++){
            for(int j=(scope-i); j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<(i*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();

/*                                      Other version
        for(int i=0; i<scope; i++){
            for(int j=(scope-i); j>0; j--){
                System.out.print(" ");
            }
            if(i==0) {
                System.out.println(" *");
            } else {
                for(int j=0; j<(i+2); j++){
                    System.out.print("* ");
                }
                System.out.println();
            }*/

        }
    }
}
