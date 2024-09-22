package jnsp.modul4.e07;

public class Car {

    private final double tankCapacity;
    private final int yearOfProduction;
    private final double combustion;

    private String make;
    private String model;
    private String color;
    private double milage;
    private int maxSpeed;
    private double fuelLevel;


    public Car(String make, String model, String color, int yearOfProduction, double tankCapacity, double combustion) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.tankCapacity = tankCapacity;
        this.combustion = combustion;

        fuelLevel = tankCapacity/2;
    }

    public Car(String make, String model, String color, int yearOfProduction, double tankCapacity, double combustion, int milage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
        this.tankCapacity = tankCapacity;
        this.combustion = combustion;
        this.milage = milage;

        fuelLevel = tankCapacity/2;
    }

    public double getCombustion() {
        return combustion;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
    public void setFuelLevel(double fuel) {
        this.fuelLevel = fuel;
    }

    public double getMilage() {
        return milage;
    }

    public void setMilage(double milage) {
        this.milage = milage;
    }

    public void drive(double distance){
        setMilage(   getMilage() + distance);
    }
    public double getTankCapacity() {
        return tankCapacity;
    }


}
