package jnsp.modul4.e29Exercises.exercise5;

public class Triangle extends AbstractShape{

    public Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    public ShapeType getType() {
        return ShapeType.TRIANGLE;
    }

    @Override
    public double calculateArea() {
        return a*b/2;
    }

    public double getBase(){
        return a;
    }
    public double getHeight(){
        return b;
    }
}
