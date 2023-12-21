package forklift;

import java.util.Scanner;

public class Forklift {
    public static void main(String[] args) {

        int[][] diagram = new int[6][6];        //  diagram wartości możliwego udźwigu - w tej wersji do ręcznego usupełnienia
        int index1=0;                           //  indeks rzędu diagramu
        int index2=0;                           //  indeks kolumny diagramu
        int[] possibleHeight = new int[6];      //  wartości z osi dozwolonej wysokości udźwigu
        int[] foreheadDistance = new int[6];    //  wartości z osi odległości środka ciężkości od czoła wideł
        int parcelWeight;                       //  ciężar palety
        int parcelLength;                       //  długość palety od strony podebrania palety
        int centerOfGravity;                    //  środek ciężkości palety

        Scanner scanner = new Scanner(System.in);

                                //  WARTOŚCI DIAGRAMU Z PRZYKŁADU Robert_osp_2.6.6
        diagram[0][0] = 1200;
        diagram[0][1] = 1050;
        diagram[0][2] = 650;

        diagram[1][0] = 950;
        diagram[1][1] = 750;
        diagram[1][2] = 450;

        diagram[2][0] = 700;
        diagram[2][1] = 450;
        diagram[2][2] = 200;

        possibleHeight[0] = 3100;
        possibleHeight[1] = 4030;
        possibleHeight[2] = 4836;

        foreheadDistance[0] = 500;
        foreheadDistance[1] = 600;
        foreheadDistance[2] = 700;

        /*diagram[0][0] = 2000;
        diagram[0][1] = 1800;
        diagram[0][2] = 1600;
        diagram[0][3] = 1400;
        diagram[0][4] = 1200;
        diagram[0][5] = 1000;

        diagram[1][0] = 1900;
        diagram[1][1] = 1700;
        diagram[1][2] = 1500;
        diagram[1][3] = 1300;
        diagram[1][4] = 1100;
        diagram[1][5] = 900;

        diagram[2][0] = 1800;
        diagram[2][1] = 1600;
        diagram[2][2] = 1400;
        diagram[2][3] = 1200;
        diagram[2][4] = 1000;
        diagram[2][5] = 800;

        diagram[3][0] = 1700;
        diagram[3][1] = 1500;
        diagram[3][2] = 1300;
        diagram[3][3] = 1100;
        diagram[3][4] = 900;
        diagram[3][5] = 700;

        diagram[4][0] = 1600;
        diagram[4][1] = 1400;
        diagram[4][2] = 1200;
        diagram[4][3] = 1000;
        diagram[4][4] = 800;
        diagram[4][5] = 600;

        diagram[5][0] = 1500;
        diagram[5][1] = 1300;
        diagram[5][2] = 1100;
        diagram[5][3] = 900;
        diagram[5][4] = 700;
        diagram[5][5] = 500;

        possibleHeight[0] = 1500;
        possibleHeight[1] = 2000;
        possibleHeight[2] = 2500;
        possibleHeight[3] = 3000;
        possibleHeight[4] = 3500;
        possibleHeight[5] = 4000;

        foreheadDistance[0] = 500;
        foreheadDistance[1] = 600;
        foreheadDistance[2] = 700;
        foreheadDistance[3] = 800;
        foreheadDistance[4] = 900;
        foreheadDistance[5] = 1000;*/



        System.out.println("Podaj ciężar palety [kg]: ");
        parcelWeight = scanner.nextInt();

        System.out.println("Podaj długość palety od strony podebrania [mm]: ");
        parcelLength = scanner.nextInt();

        centerOfGravity = parcelLength/2;

        for(int i=0; i<20; i++) {
            if (centerOfGravity >= foreheadDistance[i+1]){
                index1++;
            } else break;
        }

        for(int i=0; i<20; i++){
            if((parcelWeight <= diagram[i][index1])){
                index2++;
            } else {
                index2--;
                break;
            }
        }

        System.out.println("W tym przypadku możesz podnieść na wyskość " + possibleHeight[index2]);



        for(int i=5; i>=0; i--){
            for(int j=0; j<6; j++){
                System.out.print(diagram[i][j] + " ");
            }
            System.out.println();
        }
    }
}
