package jnsp.modul4.e29Exercises.exercise5;

public class Rectangle extends AbstractShape{
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public ShapeType getType() {
        return ShapeType.RECTANGLE;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }

    public double getLength(){
        return a;
    }

    public double getWidth(){
        return b;
    }
}
