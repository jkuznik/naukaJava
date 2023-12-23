package jnsp.modul4.e29Exercises.exercise5;

public class AbstractShape implements Shape{

    double a;
    double b;
    double c;


    public AbstractShape(double a) {
        this.a = a;
    }

    public AbstractShape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public AbstractShape(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public ShapeType getType() {
        return null;
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
