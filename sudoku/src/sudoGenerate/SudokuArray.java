package sudoGenerate;

import java.util.Random;

public class SudokuArray {

    private int[][] finalArray = new int[9][9];
    private int[][] tempArray = new int[9][9];
    private int[][][] possibleNumber = new int[9][9][9];
    private int rowNumber = 0;
    private int columnNumber = 0;
    private int number;

    private boolean clean;

    Random random = new Random();

    public void generateSudoku(){

        int attempt=0;
        long startTime = System.currentTimeMillis();

        do {
            generateFinalSquare3x3(1);
            generateFinalSquare3x3(5);
            generateFinalSquare3x3(9);
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

    public void getTempArray(int setDifficult) {
        int counter=0;

        do {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    clean = random.nextBoolean();
                    if (clean && counter < setDifficult && tempArray[i][j] != 0) {
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

    public void generateFinalSquare3x3(int field) {

        rowNumber = ((field + 2) % 3) * 3;
        columnNumber = ((field - 1) / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                number = random.nextInt(9) + 1;
                if (possibleValue(number, field, rowNumber, columnNumber)) {
                    finalArray[rowNumber][columnNumber] = number;
                    tempArray[rowNumber][columnNumber] = number;
                    columnNumber += 1;
                } else {
                    j--;
                }
            }
            columnNumber = ((field - 1) / 3) * 3;
            rowNumber += 1;
        }
    }
    /**     Generowanie wartości dla każdego pola danego segmentu 3x3 zgodnie z zasadami Sudoku;
     *      wartości są przypisywane do końcowej tablicy wartości.*/
//    public void generateTempSquare3x3(int field) {
//
//        int counter = 0;
//
//        rowNumber = ((field + 2) % 3) * 3;
//        columnNumber = ((field - 1) / 3) * 3;
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//
//                number = random.nextInt(9) + 1;     // do zmiany, stworzyc algorytm sprawdzający możliwe wartości i losująćy tylko spośród tych liczb
//
//                if (possibleValue(number, field, rowNumber, columnNumber)) {
//                    tempArray[rowNumber][columnNumber] = number;
//                    columnNumber += 1;
//                } else {
//                    j--;
//                    counter += 1;
//                    if (counter == 200) {
//                        counter = 0;
//                        i = 0;
//                        j = 0;
//                        cleanSquare3x3(field);
//                        columnNumber = ((field - 1) / 3) * 3;
//                        rowNumber = ((field + 2) % 3) * 3;
//                    }
//                }
//            }
//            columnNumber = ((field - 1) / 3) * 3;
//            rowNumber += 1;
//        }
//    }
    public void generateTempSquare3x3(int field) {

        int counter = 0;
        int counter2 =2;

        rowNumber = ((field + 2) % 3) * 3;
        columnNumber = ((field - 1) / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                number = random.nextInt(9) + 1;     // do zmiany, stworzyc algorytm sprawdzający możliwe wartości i losująćy tylko spośród tych liczb

                if (possibleValue(number, field, rowNumber, columnNumber)) {
                    tempArray[rowNumber][columnNumber] = number;
                    columnNumber += 1;
                    counter=0;
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
                finalArray[rowNumber][columnNumber] = 0;
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