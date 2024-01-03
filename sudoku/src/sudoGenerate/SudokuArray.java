package sudoGenerate;

import java.util.Random;
import java.util.Scanner;

public class SudokuArray {

    private int[][] finalArray = new int[9][9];
    private int[][] tempArray = new int[9][9];
    private int[][][] possibleNumber = new int[9][9][9];
    private int rowNumber = 0;
    private int columnNumber = 0;
    private int number;
    private boolean clean;
    private boolean clean2;
    private boolean clean3;
    private boolean clean4;
    private boolean ready=true;
    Scanner scanner = new Scanner(System.in);

    Random random = new Random();

    public void setValue(){
        int row;
        int column;
        int value;
        boolean exit=true;
        String choice;
        Scanner scanner1 = new Scanner(System.in);

        do{
           getTempArray();
            System.out.println();
            System.out.println("\tPodaj współrzędne pola które chcesz wpisać: ");
            System.out.println("Rząd: ");
            row = scanner1.nextInt();
            System.out.println("Kolumna: ");
            column = scanner1.nextInt();
            System.out.println("Wartość: ");
            value = scanner1.nextInt();
            scanner1.nextLine();

            finalArray[row-1][column-1] = value;
            tempArray[row-1][column-1] = value;

            System.out.println("Chcesz podać kolejną liczbę? [t/n]");
            choice = scanner1.nextLine();
            if (choice.equals("n")) {
                exit = false;
            }
            System.out.println();

        } while(exit);
    }
    public void generateSudoku(){

        int attempt=0;
        long startTime = System.currentTimeMillis();

        do {
            generateTempSquare3x3(1);
            generateTempSquare3x3(5);
            generateTempSquare3x3(9);
            generateTempSquare3x3(3);
            generateTempSquare3x3(7);

            do {
                setPossibleNumber();
            } while (setPossibleNumber());

            if(!checkSudo()){
                for(int i=1; i<10; i++){
                    attempt++;
                    cleanSquare3x3(i);
                }
            }

        } while (!checkSudo());
        System.out.println("Ilość prób " + attempt);

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("Czas działania aplikacji: " + elapsedTime + " milisekundy");
    }

    public void getTempArray() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                System.out.print(tempArray[i][j] + " ");
                if (j % 3 == 2) {
                    System.out.print("|");
                }
            }
            if (i % 3 == 2) {
                System.out.println();
                System.out.print("---------------------");
            }
            System.out.println();
        }
    }
    /**     Wyświetlanie akutalnych wartości wszystkich pól Sudoku.
     * */

    public void getTempArray(int setDifficult) {

        int valueToClean = setDifficult/9;
        int counter=0;

        do {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {

                    clean = random.nextBoolean();
                    clean2 = random.nextBoolean();
                    clean3 = random.nextBoolean();
                    clean4 = random.nextBoolean();

                    if (clean && clean2 && clean3 && clean4 && counter < setDifficult && tempArray[i][j] != 0) {
                        tempArray[i][j] = 0;
                        counter++;
                    }
//                    System.out.print(tempArray[i][j] + " ");
                    if (j % 3 == 2) {
//                        System.out.print("|");
                    }
                }
                if (i % 3 == 2) {
//                    System.out.println();
//                    System.out.print("---------------------");
                }
//                System.out.println();
            }
        }while(counter!=setDifficult);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(tempArray[i][j] == 0) System.out.print("  ");
                else System.out.print(tempArray[i][j] + " ");
                if (j % 3 == 2) {
                    System.out.print("|");
                }
            }
            if (i % 3 == 2) {
                System.out.println();
                System.out.print("---------------------");
            }
            System.out.println();
        }
    }
    /**     Wyświetlanie rozwiązywalną tablice Sudoku z określoną ilością pustych pól
     * */

    public boolean setFinalSquare3x3() {

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {

                    if (tempArray[i][j] == 0) {
                        finalArray[i][j] = scanner.nextInt();
                        tempArray[i][j] = finalArray[i][j];
                        return true;
                    } else {
                        if(tempArray[i][j] == 10) System.out.print("x ");
                        else System.out.print(tempArray[i][j] + " ");

                        if (j % 3 == 2) {
                            System.out.print("|");
                        }
                    }
                }
                if (i % 3 == 2) {
                    System.out.println();
                    System.out.print("---------------------");
                }
                System.out.println();
            }
        return false;
    }
    /**     Generowanie wartości dla każdego pola danego segmentu 3x3 zgodnie z zasadami Sudoku;
     *      wartości są przypisywane do końcowej tablicy wartości.*/

    public void generateTempSquare3x3(int field) {

               /* 5 3 4 | 6 7 8 | 9 1 2
                6 7 2 | 1 9 5 | 3 4 8
                1 9 8 | 3 4 2 | 5 6 7
                ------+-------+------
                8 5 9 | 7 6 1 | 4 2 3
                4 2 6 | 8 5 3 | 7 9 1
                7 1 3 | 9 2 4 | 8 5 6
                ------+-------+------
                9 6 1 | 5 3 7 | 2 8 4
                2 8 7 | 4 1 9 | 6 3 5
                3 4 5 | 2 8 6 | 1 7 9



                5 3 0 | 0 7 0 | 0 0 0
                6 0 0 | 1 9 5 | 0 0 0
                0 9 8 | 0 0 0 | 0 6 0
                ------+-------+------
                8 0 0 | 0 6 0 | 0 0 3
                4 0 0 | 8 0 3 | 0 0 1
                7 0 0 | 0 2 0 | 0 0 6
                ------+-------+------
                0 6 0 | 0 0 0 | 2 8 0
                0 0 0 | 4 1 9 | 0 0 5
                0 0 0 | 0 8 0 | 0 7 9*/
        finalArray[0][0] = 5;
        finalArray[0][1] = 3;
        finalArray[0][4] = 7;

        finalArray[1][0] = 6;
        finalArray[1][3] = 1;
        finalArray[1][4] = 9;
        finalArray[1][5] = 5;

        finalArray[2][1] = 9;
        finalArray[2][2] = 8;
        finalArray[2][7] = 6;

//        tempArray[3][0] = 8;
//        tempArray[3][4] = 6;
//        tempArray[3][8] = 3;
//
//        tempArray[4][0] = 4;
//        tempArray[4][3] = 8;
//        tempArray[4][5] = 3;
//        tempArray[4][8] = 1;
//
//        tempArray[5][0] = 7;
//        tempArray[5][4] = 2;
//        tempArray[5][8] = 6;
//
//        tempArray[6][1] = 6;
//        tempArray[6][6] = 2;
//        tempArray[6][7] = 8;
//
//        tempArray[7][3] = 4;
//        tempArray[7][4] = 1;
//        tempArray[7][5] = 9;
//        tempArray[7][8] = 5;
//
//        tempArray[8][4] = 8;
//        tempArray[8][7] = 7;
//        tempArray[8][8] = 9;

        int counter = 0;
        int counter2 =2;

        rowNumber = ((field + 2) % 3) * 3;
        columnNumber = ((field - 1) / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {


                if (tempArray[rowNumber][columnNumber] == 0 && finalArray[rowNumber][columnNumber]==0) {
                    /**    Sprawdzanie wartości wprowadzonych przez uzytkowniak*/

                    number = random.nextInt(9) + 1;     // do zmiany, stworzyc algorytm sprawdzający możliwe wartości i losująćy tylko spośród tych liczb

                    if (possibleValue(number, field, rowNumber, columnNumber)) {
                        tempArray[rowNumber][columnNumber] = number;
                        columnNumber += 1;
                        counter = 0;
                    } else {
                        j--;
                        counter += 1;
                        if (counter == 40) {
                            counter = 0;
                            i = 0;
                            j = 0;
                            cleanSquare3x3(field);
                            columnNumber = ((field - 1) / 3) * 3;
                            rowNumber = ((field + 2) % 3) * 3;
                        }
                    }
                } continue;
            }


            columnNumber = ((field - 1) / 3) * 3;
            rowNumber += 1;
        }
    }
    /**     Generowanie wartości dla każdego pola danego segmentu 3x3 zgodnie z zasadami Sudoku;
     *      wartości są przypisywane do tymczasowej tablicy wartości.
     *
     *      NOTATKA     Poprawić działanie metody w sytuacji braku możliwości wypełnienia.
     *      */
    public void cleanSquare3x3(int field) {

        rowNumber = ((field + 2) % 3) * 3;
        columnNumber = ((field - 1) / 3) * 3;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                tempArray[rowNumber][columnNumber] = 0;
//                finalArray[rowNumber][columnNumber] = 0;
                columnNumber += 1;
            }

            columnNumber = ((field - 1) / 3) * 3;
            rowNumber += 1;
        }
    }
    /**     Zerowanie wszystkich wartości dla danego segmentu 3x3.
     * */
    public boolean compareSquareValue(int number, int field) {

        int index = ((field + 2) % 3) * 3;
        int index2 = ((field - 1) / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (number == tempArray[index][index2]) {
                    return false;
                }
                index2++;
            }
            index2 = ((field - 1) / 3) * 3;
            index++;
        }
        return true;
    }
    /**     Sprawdzanie czy dana liczba spełnia warunki zasady Sudoku dla danego segmentu 3x3.
     * */

    public boolean compareRow(int number, int rowNumber) {

        for (int i = 0; i < 9; i++) {
            if (number == tempArray[rowNumber][i]) {
                return false;
            }
        }
        return true;
    }
    /**     Sprawdzanie czy dana liczba spełnia warunki zasady Sudoku dla danego rzędu.
     * */
    public boolean compareColumn(int number, int columnNumber) {

        for (int i = 0; i < 9; i++) {
            if (number == tempArray[i][columnNumber]) {
                return false;
            }
        }
        return true;
    }
    /**     Sprawdzenie czy dana liczba spełnia warunki zasady Sudoku dla danej kolumny.
     * */
    public boolean possibleValue(int number, int field, int rowNumber, int columnNumber) {

        if (compareRow(number, rowNumber) && compareColumn(number, columnNumber) &&
                compareSquareValue(number, field)) {
//            System.out.println(number + " " + true);
            return true;
        }

        return false;
    }
    /**     Sprawdzanie czy dana liczba spełnia warunki zasady Sudoku dla danego rzędu, kolumny oraz
     *      segmentu 3x3.
     *      */
    public void getPossibleNumber() {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                for (int k = 0; k < 9; k++) {
                    possibleNumber[i][j][k] = 0;
                }
            }
        }

        for (int field = 1; field < 10; field++) {

            int index = ((field + 2) % 3) * 3;          // rowNumber
            int index2 = ((field - 1) / 3) * 3;         // columnNumber
            int index3 = 0;                             // possibleNumberSize

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tempArray[index][index2] == 0) {

                        for (int k = 1; k < 10; k++) {
                            if (possibleValue(k, field, index, index2)) {
                                possibleNumber[index][index2][index3] = k;
                                index3++;
                            }
                        }
                    }
                    index2++;
                    index3 = 0;
                }
                index2 = ((field - 1) / 3) * 3;
                index++;
            }
        }
    }
    /**     Sprawdzenie wszystkich możliwych wartości dla każdego z pól Sudoku oraz przypisanie tych wartości
     *      do trójwymiarowej tablicy.
     *      Metoda sprawdza wszystkie pola w poszczególnym segmencie 3x3 po czym przechodzi do kolejnego segmentu.
     *      */

    public int get3MatrixLenght(int rowNumber, int columnNumber) {

        int lenght = 0;

        for (int i = 0; i < 9; i++) {
            if (possibleNumber[rowNumber][columnNumber][i] == 0) {
                return lenght;
            }
            lenght++;
        }
        return lenght;
    }
    /**     Sprawdzanie wielkości trzeciego wymiaru tablicy przechowującej wszystkie możliwe wartości
     *      dla danego pola Sudoku.
     *
     *      NOTATKA     Jak do tąd wykorzystywane tylko w przypadku gdy dane pole posiada tylko jedną
     *                  możliwość.
     *                  */
    public boolean setPossibleNumber() {

        boolean flag = false;

        getPossibleNumber();

        for (int field = 1; field < 10; field++) {

            int index = ((field + 2) % 3) * 3;          // rowNumber
            int index2 = ((field - 1) / 3) * 3;         // columnNumber
                                                        // possibleNumberSize

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (get3MatrixLenght(index, index2) == 1 &&
                         compareSquareValue(possibleNumber[index][index2][0], field)) {
                        tempArray[index][index2] = possibleNumber[index][index2][0];
                        flag = true;
                    }
                    index2++;
                }
                index2 = ((field - 1) / 3) * 3;
                index++;
            }
        }

        if(flag) { return true; }
        else { return false; }
    }
    /**     Ustawienie wartości pola w przypadku gdy jest jedyną możliwą.
     * */

    public boolean checkSudo(){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(tempArray[i][j]==0) { return false;}
            }
        }
        return true;
    }
}



//1 - i 012           1/4 = 0
//    j 012           3%3 = 0
//2   i 012           2/4 = 0
//    j 345           4%3 = 1
//3   i 012           3/4 = 0
//    j 678           5%3 = 2
//
//4   i 345           4/4 = 1
//    j 012           6%3 = 0
//5   i 345           5/4 = 1
//    j 345           7%3 = 1
//6   i 345           6/4 = 1
//    j 678           8%3 = 2
//
//7   i 678
//    j 012
//8   i 678
//    j 345
//9   i 678
//    j 678

/*    public boolean checkTempSquare3x3(int field) {

        columnNumber = ((field - 1) / 3) * 3;
        rowNumber = ((field + 2) % 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if(tempArray[rowNumber][columnNumber]==0){
                    cleanSquare3x3(field);
                    generateTempSquare3x3(field);
                    return true;
                }
                columnNumber += 1;
            }
            columnNumber = ((field - 1) / 3) * 3;
            rowNumber += 1;
        }
        return false;
    }*/

/*  public void generateTempArray() {

 for (int field = 1; field < 10; field++) {

 columnNumber = ((field - 1) / 3) * 3;
 rowNumber = ((field + 2) % 3) * 3;

 for (int i = 0; i < 3; i++) {
 for (int j = 0; j < 3; j++) {

 if (finalArray[rowNumber][columnNumber] == 0 || tempArray[rowNumber][columnNumber] == 0) {

 //                        for (int number = 1; number < 10; number++) {  /* wpisywanie wartości i testowanie zgodności kolejno od 1 do 9
                            number = random.nextInt(9)+1;         /* wpisywanie wartości metodą losową od 1 do 9
                                    if (possibleValue(number, field, rowNumber, columnNumber)){
                                    tempArray[rowNumber][columnNumber] = number;
                                    break;
                                    }
                                    }
                                    columnNumber++;
                                    }
                                    columnNumber = ((field - 1) / 3) * 3;
                                    rowNumber += 1;

                                    }
                                    }
                                    } */

//            9 1 3 |5   7 |2 6 4 |
//            2 5 8 |4 6 1 |3 7 9 |
//            7 4 6 |      |8 1 5 |
//            ---------------------
//            8   1 |6 5 9 |7   2 |
//                  |1   3 |9   6 |
//            6   9 |      |5   1 |
//            ---------------------
//            3 6   |      |1 9   |
//            1 9   |8   6 |  5 7 |
//              8   |  1   |  2   |
//            ---------------------