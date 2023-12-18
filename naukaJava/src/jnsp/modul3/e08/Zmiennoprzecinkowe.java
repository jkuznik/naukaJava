package jnsp.modul3.e08;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Zmiennoprzecinkowe {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 2.0;

        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println(a + " % " + b + " = " + (a % b));

        // zaokrąglanie liczby zmiennoprzecinkowej

        double c = a/b;

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(Math.round(c));

//        System.out.println(Math.round(c*100.0)/100.0);
//
//        BigDecimal roundedNumber = new BigDecimal(c).setScale(3,
//                                            RoundingMode.HALF_UP);
//
//        System.out.println(roundedNumber.doubleValue());
//
//        DecimalFormat decimalFormat = new DecimalFormat("###.###");
//
//        System.out.println(decimalFormat.format(c));
//
//        String formattedNumber = String.format("%.2f", c);
//
//        System.out.println(formattedNumber);


    }

}
