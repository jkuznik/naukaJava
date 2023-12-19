import sudoGenerate.SudokuArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SudokuArray firstSudo = new SudokuArray();

        int setDifficult;
        Scanner scanner = new Scanner(System.in);

        firstSudo.generateSudoku();

        System.out.println("\nPodaj na jakim poziomie trudności chcesz grać? [30-55]");
        setDifficult = scanner.nextInt();
        scanner.nextLine();

        firstSudo.getTempArray(setDifficult);

        // dopisać zapytanie o podpowiedź lub o rozwiązanie danego sudoku

    }

}




