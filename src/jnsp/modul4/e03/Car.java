package jnsp.modul4.e03;

public class Car {

     String brand;
     String model;
     String color;
     int yearOfProduction;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;

        this.yearOfProduction = 2023;
    }

    public Car(String brand, String model, String color, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }
}
