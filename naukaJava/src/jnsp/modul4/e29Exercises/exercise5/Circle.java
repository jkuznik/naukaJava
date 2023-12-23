package jnsp.modul4.e29Exercises.exercise5;

public class Circle extends AbstractShape{

    public Circle(int a) {
        super(a);
    }

    @Override
    public ShapeType getType() {
        return ShapeType.CIRCLE;
    }

    @Override
    public double calculateArea() {
        return Math.pow(a,2)  * Math.PI ;
    }

    public double getRadius(){
        return a;
    }
}
