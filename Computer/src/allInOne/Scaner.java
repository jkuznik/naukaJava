package allInOne;

import utilites.UtilitesType;

public class Scaner extends AllInOneAbstract{

    public Scaner(String name, double price) {
        super(name, price);
    }

    @Override
    public void print() {
        System.out.println("Printing is not available");
    }

    @Override
    public void scan() {
        System.out.println("Scanning in progress...");
    }

    @Override
    public UtilitesType getType() {
        return UtilitesType.SCANER;
    }
}
