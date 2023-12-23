package jnsp.modul4.e09;

public class Potega3Liczby extends PotegaLiczby{

    @Override
    public int potegowanie(int number) {
        return number * super.potegowanie(number);
    }
}
