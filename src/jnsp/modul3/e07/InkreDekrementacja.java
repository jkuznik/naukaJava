package jnsp.modul3.e07;

public class InkreDekrementacja {
    public static void main(String[] args) {

        int a=10;
        int b;

        a++;        // postinkrementacja
        ++a;        // preinkremetacja

        a= 10;

        System.out.println(a++ + " postinkremetacja liczby");
        a--;
        System.out.println(++a + " preinkrementacja liczby");


        b=a++;

        System.out.println(b);
        System.out.println(a);
    }
}
