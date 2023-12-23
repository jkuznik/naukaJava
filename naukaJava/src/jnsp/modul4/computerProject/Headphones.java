package jnsp.modul4.computerProject;

import jnsp.modul4.computerProject.utilites.Utilites;
import jnsp.modul4.computerProject.utilites.UtilitesType;

public class Headphones implements Utilites {
    private String name;
    private double price;

    public Headphones(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getUtiliteName() {
        return name;
    }

    public double getPrice(){
        return price;
    }

    @Override
    public UtilitesType getType() {
        return UtilitesType.HEADPHONES;
    }
}
