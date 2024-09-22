package jnsp.modul4.computerProject.allInOne;

public abstract class AllInOneAbstract implements AllInOne{
    protected String name;
    protected double price;

    public AllInOneAbstract(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getUtiliteName() {
        return name;
    }

    @Override
    public double price() {
        return price;
    }
}
