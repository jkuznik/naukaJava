package jnsp.modul4.e29Exercises.exercise3;

import java.util.Objects;

public class Rectangle {

    int a=0;
    int b=0;
    double c=0d;
    double d=0d;

    public Rectangle(double c) {
        this.c = c;
        this.d = c;
    }

    public Rectangle(int a) {
        this.a = a;
        this.b = a;
    }

    public Rectangle(double c, double d) {
        if(d>c){
            this.d = c;
            this.c = d;
        } else {
            this.c = c;
            this.d = d;
        }
    }

    public Rectangle(int a, int b) {
        if(b>a){
            this.b = a;
            this.a = b;
        } else {
            this.a = a;
            this.b = b;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return a == rectangle.a && b == rectangle.b && Double.compare(c, rectangle.c) == 0 && Double.compare(d, rectangle.d) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, d);
    }

    public boolean isSquare(){
        if ((a==b) && (c==d)) return true;
        return false;


    }
}
