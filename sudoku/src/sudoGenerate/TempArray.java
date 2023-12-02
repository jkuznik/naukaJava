package sudoGenerate;

import java.util.Random;

public class TempArray {

    private int[][] tempArray = new int[9][9];
    private int[] row = new int[9];
    private int[] column = new int[9];
    private int rowNumber = 0;
    private int columnNumber = 0;
    private int field;
    private int number;

    Random random = new Random();


    public void generateTempArray() {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                number = random.nextInt(9) + 1;

                for (int k = 0; k < 9; k++) {
                    if (number == tempArray[i][k]) {
                        j--;
                        break;
                    } else if (k == 8) {
                        tempArray[i][j] = number;
                    }
                }
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

    public void generateSquare3x3(int field) {

        columnNumber = ((field-1) / 3) *3;
        rowNumber = ((field + 2) % 3) * 3;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                number = random.nextInt(9);
                tempArray[rowNumber][columnNumber] = number;
                columnNumber += 1;
            }
            columnNumber = ((field - 1) / 3) * 3;
            rowNumber += 1;
        }
    }

    public void getSquare3x3(int field) {
        columnNumber = ((field - 1) / 3) * 3;
        rowNumber = ((field + 2) % 3) * 3;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(tempArray[rowNumber][columnNumber] + " ");
                columnNumber += 1;
            }

            System.out.println(rowNumber);
            columnNumber = ((field - 1) / 3) * 3;
            rowNumber += 1;
        }
    }

    public boolean compareColumn(int check){

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