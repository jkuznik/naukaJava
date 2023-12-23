package jnsp.modul4.e29Exercises.exercise3;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5);
        Rectangle rectangle2 = new Rectangle(5.8);
        Rectangle rectangle3 = new Rectangle(5,6);
        Rectangle rectangle4 = new Rectangle(5.6,6.5);

        Rectangle rectangle5 = new Rectangle(5,5);
        Rectangle rectangle6 = new Rectangle(5.6,5.6);

        Rectangle rectangle7 = new Rectangle(4, 8);
        Rectangle rectangle8 = new Rectangle(8, 4);

        System.out.println(rectangle1.isSquare());
        System.out.println(rectangle2.isSquare());
        System.out.println(rectangle3.isSquare());
        System.out.println(rectangle4.isSquare());
        System.out.println(rectangle5.isSquare());
        System.out.println(rectangle6.isSquare());

        System.out.println("Metoda equals dla prostokąta 5 i 1 " + rectangle5.equals(rectangle1));
        System.out.println("Metoda equals dla prostokąta 7 i 8 " + rectangle7.equals(rectangle8));
    }
}
