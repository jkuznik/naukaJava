package jnsp.modul4.computerProject.allInOne;

import jnsp.modul4.computerProject.utilites.UtilitesType;

public class AllInOneUtilites extends AllInOneAbstract{

    public AllInOneUtilites(String name, double price) {
        super(name, price);
    }

    @Override
    public void print() {
        System.out.println("Printing in progress...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning in progress...");
    }

    @Override
    public UtilitesType getType() {
        return UtilitesType.ALLINONE;
    }
}
