package jnsp.modul3.e10;

import java.math.BigDecimal;

public class OperacjeFinansowe {
    public static void main(String[] args) {

        double a = 0.1;
        double b = 0.2;
        double c = 2.55;
        double d = 2.45;

        System.out.println(c - d);
        System.out.println((a+b));

        BigDecimal value1 = new BigDecimal("0.1");
        BigDecimal value2 = new BigDecimal("0.2");

        System.out.println(value1.add(value2));


    }
}
