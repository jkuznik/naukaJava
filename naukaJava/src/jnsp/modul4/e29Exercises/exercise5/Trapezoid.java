package jnsp.modul4.e29Exercises.exercise5;

public class Trapezoid extends AbstractShape{
    public Trapezoid(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public ShapeType getType() {
        return ShapeType.TRAPEZOID;
    }

    @Override
    public double calculateArea() {
        return ((a+b)*c)/2;
    }

    public double getBase1(){
        return a;
    }

    public double getBase2(){
        return b;
    }

    public double getHeight(){
        return c;
    }
}
