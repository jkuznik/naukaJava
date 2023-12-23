package jnsp.modul4.e09;

public class Potega4Liczby extends Potega3Liczby{

    @Override
    public int potegowanie(int number) {
        return number * super.potegowanie(number);
    }
}
