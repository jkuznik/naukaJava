import sudoGenerate.SudokuArray;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SudokuArray firstSudo = new SudokuArray();

        int setDifficult;
        Scanner scanner = new Scanner(System.in);

        firstSudo.generateSudoku();

        System.out.println("\nPodaj na jakim poziomie trudności chcesz grać? [30-55]");
        // dopisać sprawdzanie czy poprawnie wybrano poziom trudności
        setDifficult = scanner.nextInt();
        scanner.nextLine();

        firstSudo.getTempArray();

        System.out.println();
        System.out.println();
        System.out.println();

        firstSudo.getTempArray(setDifficult);

        

        // dopisać zapytanie o podpowiedź lub o rozwiązanie danego sudoku


//          poniżej - sprawdzanie skuteczności metody generującej Sudoku na przykładzie 100000 prób
//                      skuteczność około 6%..
//
//    SudokuArray[] sudoArray = new SudokuArray[100000];
//    int correct=0;
//
//        for (int i = 0; i <100000; i++) {
//        sudoArray[i] = new SudokuArray();
//    }
//
//        for(int i=1; i<100000-1; i++){
//        sudoArray[i].generateFinalSquare3x3(1);
//        sudoArray[i].generateFinalSquare3x3(5);
//        sudoArray[i].generateFinalSquare3x3(9);
//        sudoArray[i].generateTempSquare3x3(3);
//        sudoArray[i].generateTempSquare3x3(7);
//        do {
//            sudoArray[i].setPossibleNumber();
//        }while(sudoArray[i].setPossibleNumber());
//        sudoArray[i].setPossibleNumber();
//        if(sudoArray[i].checkSudo()) {
//            // sudoArray[i].getTempArray();
//            correct++;
//            System.out.println(correct);
//            System.out.println();
//        }
//
//    }


    }

}




