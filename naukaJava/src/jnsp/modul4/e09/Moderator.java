package jnsp.modul4.e09;

public class Moderator extends User{
    @Override
    public void hello(String text) {
        System.out.println("Jestem moderator, a Ty wpisałeś " + text);

    }
}
