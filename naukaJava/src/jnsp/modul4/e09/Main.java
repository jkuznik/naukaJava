package jnsp.modul4.e09;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        Moderator moderator = new Moderator();
        Administrator administrator = new Administrator();

        user.hello("Zalogowany jako user");
        moderator.hello("Zalogowany jako user");
        administrator.hello("Zalogowany jako user");


        PotegaLiczby potegaLiczby = new PotegaLiczby();
        Potega3Liczby potega3Liczby = new Potega3Liczby();
        Potega4Liczby potega4Liczby = new Potega4Liczby();

        System.out.println(potegaLiczby.potegowanie(3));
        System.out.println(potega3Liczby.potegowanie(3));
        System.out.println(potega4Liczby.potegowanie(3));

    }
}
