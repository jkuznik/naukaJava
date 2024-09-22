package jnsp.modul4.e07;

public class Driver {
    private final String name;
    private double money;

    public Driver(double money, String name) {
        this.money = money;
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }
}
