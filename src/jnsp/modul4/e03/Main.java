package jnsp.modul4.e03;

public class Main {
    public static void main(String[] args) {

        Car tt = new Car("Audi", "TT","Black", 1999);
        Car gullia = new Car("Alfa Romeo", "Gullia", "Black");

        System.out.println(tt.brand);
        System.out.println(tt.yearOfProduction);
        System.out.println(tt.color);

        tt.color = "Orange";

        System.out.println(tt.color);

        System.out.println(gullia.yearOfProduction);
    }
}
