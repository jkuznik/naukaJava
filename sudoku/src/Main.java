import sudoGenerate.TempArray;

public class Main {
    public static void main(String[] args) {

        TempArray firstSudo = new TempArray();
        TempArray secondSudo = new TempArray();

//        for (int i =1; i<10; i++) {
//            firstSudo.generateTempSquare3x3(i);
//        }
//         .generateTempArray(); METHOD and .genenerateSquare3x3(int) from 1 to 10 loop -- doing this same

        firstSudo.generateFinalSquare3x3(3);
        firstSudo.generateFinalSquare3x3(5);
        firstSudo.generateFinalSquare3x3(7);
//        firstSudo.generateTempSquare3x3(3);
        firstSudo.generateTempArray();
        firstSudo.getTempArray();

//        firstSudo.possibleValue(1, 0,0);
//        firstSudo.possibleValue(2, 0,0);
//        firstSudo.possibleValue(3, 0,0);
//        firstSudo.possibleValue(4, 0,0);
//        firstSudo.possibleValue(5, 0,0);
//        firstSudo.possibleValue(6, 0,0);
//        firstSudo.possibleValue(7, 0,0);
//        firstSudo.possibleValue(8, 0,0);
//        firstSudo.possibleValue(9, 0,0);

        System.out.println();
        System.out.println();
        System.out.println();

//        firstSudo.generateFinalSquare3x3(2);
//        firstSudo.generateFinalSquare3x3(3);
//        firstSudo.generateFinalSquare3x3(4);
//        firstSudo.generateFinalSquare3x3(6);
//        firstSudo.generateFinalSquare3x3(7);
//        firstSudo.generateFinalSquare3x3(8);

//        firstSudo.getTempArray();

//        firstSudo.getTempSquare3x3(5);

    }
}




