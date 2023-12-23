package jnsp.modul4.e29Exercises.exercise5;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(6);
        Rectangle rectangle = new Rectangle(5, 7);
        Triangle triangle = new Triangle(2, 6);
        Trapezoid trapezoid = new Trapezoid(3,6,3);


        System.out.println("Okrąg ma typ " + circle.getType());
        System.out.println("Prostokąt ma typ " + rectangle.getType());
        System.out.println("Trójkąt ma typ " + triangle.getType());
        System.out.println("Trapez ma typ " + trapezoid.getType());

        System.out.println();

        System.out.println("Okrąg o promieniu " + circle.getRadius() + " ma pole " +
                " równe " + circle.calculateArea());

        System.out.println("Prostokąt o długości " + rectangle.getLength() + " i szerokości " +
                        " " + rectangle.getWidth() + " ma pole równe " + rectangle.calculateArea());

        System.out.println("Trójkąt o podstawie " + triangle.getBase() + " i wysokości " +
                " " + triangle.getHeight() + " ma pole równe " + triangle.calculateArea());

        System.out.println("Trapez o podstawie " + trapezoid.getBase1() + " oraz " +
                trapezoid.getBase2() + " i wysokości " + trapezoid.getHeight() + " ma pole " +
                "równe " + trapezoid.calculateArea());

    }
}
