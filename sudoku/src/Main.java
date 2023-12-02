import sudoGenerate.TempArray;

public class Main {
    public static void main(String[] args) {

        TempArray firstSudo = new TempArray();
        TempArray secondSudo = new TempArray();

        /** firstSudo.generateTempArray();

        for (int i =1; i<10; i++) {
            firstSudo.generateSquare3x3(i);
        }
         .generateTempArray(); METHOD and .genenerateSquare3x3(int) from 1 to 10 loop -- doing this same
         */

        firstSudo.generateTempArray();

        firstSudo.getTempArray();

        System.out.println("Hello world!");
    }
}