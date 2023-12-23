package jnsp.modul4.computerProject.allInOne;

import jnsp.modul4.computerProject.utilites.UtilitesType;

public class Printer extends AllInOneAbstract{


    public Printer(String name, double price) {
        super(name, price);
    }

    @Override
    public void print() {
        System.out.println("Printing in progress...");
    }

    @Override
    public void scan() {

    }

    @Override
    public UtilitesType getType() {
        return UtilitesType.PRINTER;
    }
}
