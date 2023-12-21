package jnsp.modul3.e15Exercies;

import java.util.*;

public class SortowanieLiczb {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int index =10;
        int[] number = new int[index];

        List<Integer> sorted = new ArrayList<>();


        for(int i=0; i<index; i++){
            System.out.println("Podaj kolejną liczbę: ");
            number[i] = scanner.nextInt();
        }

        System.out.println("Podane liczby to: ");

        for(int i=0; i<index; i++){
            System.out.print(number[i] + " ");
        }

        for(int i =0; i<index; i++){
            sorted.add(number[i]);
        }

//        Arrays.sort(number);
//
//        System.out.println("Liczby posortowane rosnąco : " + Arrays.toString(number));

        Collections.sort(sorted);

        System.out.println("Sortowanie rosnące " + sorted);

        Collections.sort(sorted, Collections.reverseOrder());

        System.out.println("Sortowanie malejące " + sorted);



    }
}
