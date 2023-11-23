import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dla Kubusia i Julki");

        String name = new String();
        int count = 0;
        long number = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kto będzie korzystał?");

        name = scanner.nextLine();

        System.out.println("Cześć " + name + "!");
        System.out.println("Ile razy policzyc?");

        count = scanner.nextInt();

        for(int i=1; i<=count; i++){
            System.out.println(i + " równanie -- " + number + " + " + number + " = "+ (number *2));
            number *= 2;
        }




    }
}