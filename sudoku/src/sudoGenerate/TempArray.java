package sudoGenerate;

import java.util.Random;

public class TempArray {

    private int[][] workArray = new int[9][9];
    private int[][] tempArray = new int[9][9];
    private int[] squareValue = new int[9];
    private int rowNumber = 0;
    private int columnNumber = 0;
    private int number;
    private int[] possibleValue = new int[9];

    Random random = new Random();

    /**             Pierwszy generator          */

//    public void generateTempArray() {
//
//          Działający generator wszystkich pól sudoku zgodnie z zasadą sudoku w poszczególnum
//          rzędzie
//
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//
//                number = random.nextInt(9) + 1;
//
//                for (int k = 0; k < 9; k++) {
//                    if (number == tempArray[i][k]) {
//                        j--;
//                        break;
//                    } else if (k == 8) {
//                        tempArray[i][j] = number;
//                    }
//                }
//            }
//        }
//    }

    /**
     * Drugi generator
     */

    /*   public void generateTempArray() {

     *//*Działający generator zgodnie z zasadami sudoku w rzędzie i kolumnie, nie działa
          zasada soudoku w danym kwadracie*//*

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if ((workArray[i][j] == 0) ) {

                    Tutaj uzupełnić generowanie sudoku



                } else {
                    tempArray[i][j] = workArray[i][j];
                }
            }
        }

    }*/

    /**
     * Trzeci generator
     */

    public void generateTempArray() {
        int counterRow = 0;
        int counterPossibleValue = 0;

        for (int field = 1; field < 10; field++) {

            columnNumber = ((field - 1) / 3) * 3;
            rowNumber = ((field + 2) % 3) * 3;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    if (workArray[rowNumber][columnNumber] == 0) {

                        for (int number = 1; number < 10; number++) {
                            if (possibleValue(number, rowNumber, columnNumber) &&
                                    !compareSquareValue(number, field)) {
                                tempArray[rowNumber][columnNumber] = number;
                                break;
                            }
                        }
                    }
                    columnNumber++;
                }
                columnNumber = ((field - 1) / 3) * 3;
                rowNumber += 1;

            }
        }
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

    public boolean checkTempArray() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (tempArray[i][j] == 0) {
                    return true;
                }

                if (j % 3 == 2) {
//                    System.out.print("|");
                }
            }
            if (i % 3 == 2) {
//                System.out.println();
//                System.out.print("---------------------");
            }
//            System.out.println();
        }
        return false;
    }

    public void generateFinalSquare3x3(int field) {
        int index = 0;

        for (int i = 0; i < 9; i++) {
            squareValue[i] = 0;
        }

        columnNumber = ((field - 1) / 3) * 3;
        rowNumber = ((field + 2) % 3) * 3;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                number = random.nextInt(9) + 1;
                if (!compareSquareValue(number, field)) {
                    workArray[rowNumber][columnNumber] = number;
                    tempArray[rowNumber][columnNumber] = number;
                    squareValue[index] = number;
                    columnNumber += 1;
                    index += 1;
                } else {
                    j--;
                }
            }
            columnNumber = ((field - 1) / 3) * 3;
            rowNumber += 1;
        }
    }

    public void generateTempSquare3x3(int field) {

        int index = 0;
        int counter = 0;

        for (int i = 0; i < 9; i++) {
            squareValue[i] = 0;
        }

        columnNumber = ((field - 1) / 3) * 3;
        rowNumber = ((field + 2) % 3) * 3;


        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                number = random.nextInt(9) + 1;
                if (compareSquareValue(number, field)) {
//                    if (compareRow(number, i) && compareColumn(number, j)) {
                    tempArray[rowNumber][columnNumber] = number;
                    squareValue[index] = tempArray[rowNumber][columnNumber];
                    columnNumber += 1;
                    index += 1;
                } else {
                    j--;
                    counter += 1;
                    if (counter == 1000) {
                        i = 0;
                        j = 0;
                        columnNumber = ((field - 1) / 3) * 3;
                        rowNumber = ((field + 2) % 3) * 3;
                    }
                }
            }
            columnNumber = ((field - 1) / 3) * 3;
            rowNumber += 1;
        }

        columnNumber = ((field - 1) / 3) * 3;
        rowNumber += 1;
    }


    public void getTempSquare3x3(int field) {

        int index = 0;

        for (int i = 0; i < 9; i++) {
            squareValue[i] = 0;
        }

        columnNumber = ((field - 1) / 3) * 3;
        rowNumber = ((field + 2) % 3) * 3;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                squareValue[index] = tempArray[rowNumber][columnNumber];

                System.out.print(tempArray[rowNumber][columnNumber] + " ");
                columnNumber += 1;
                index += 1;
            }

            System.out.println();
            columnNumber = ((field - 1) / 3) * 3;
            rowNumber += 1;
        }

    }


    public void cleanSquare3x3(int field) {
        columnNumber = ((field - 1) / 3) * 3;
        rowNumber = ((field + 2) % 3) * 3;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                tempArray[rowNumber][columnNumber] = 0;
                columnNumber += 1;
            }

            columnNumber = ((field - 1) / 3) * 3;
            rowNumber += 1;
        }
    }

    public boolean compareSquareValue(int number, int field) {
        int index2 = ((field - 1) / 3) * 3;
        int index = ((field + 2) % 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (number == tempArray[index][index2]) {
                    return true;
                }
                index2++;
            }
            index2 = ((field - 1) / 3) * 3;
            index++;
        }
        return false;
    }


    public boolean compareRow(int number, int rowNumber) {

        for (int i = 0; i < 9; i++) {
            if (number == tempArray[rowNumber][i]) {
                return false;
            }
        }
        return true;
    }

    public boolean compareColumn(int number, int columnNumber) {

        for (int i = 0; i < 9; i++) {
            if (number == tempArray[i][columnNumber]) {
                return false;
            }
        }
        return true;
    }

    public boolean possibleValue(int number, int rowNumber, int columnNumber) {

        if (compareRow(number, rowNumber) && compareColumn(number, columnNumber)) {
//            System.out.println(number + " " + true);
            return true;}

        return false;
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