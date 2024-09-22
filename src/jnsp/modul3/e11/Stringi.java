package jnsp.modul3.e11;

public class Stringi {
    public static void main(String[] args) {

        String name = "janusz";
        name = name.toUpperCase();
        boolean initial = name.startsWith("J");
        boolean initial2 = name.endsWith("usz");

        int length = name.length();

        String text = " Kurs-Jak nauczyc sie programowania ";

        System.out.println(length);

        System.out.println(text);
        String text2 = text.replace(" ", "-");
        System.out.println(text2);

        System.out.println(initial + " " + initial2);
        System.out.println(name);

        String text3 = text.strip();
        text3 = text3.toUpperCase();

        do {
            text3 = text3.substring(1);
        } while (!text3.startsWith(" "));

        text3 = text3.strip();
        System.out.println("Zadanie domowe : \n"+ text+ "\n" + text3);



    }
}
