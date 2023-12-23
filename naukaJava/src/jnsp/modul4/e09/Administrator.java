package jnsp.modul4.e09;

public class Administrator extends Moderator{
    @Override
    public void hello(String text) {
        System.out.println("Jestem admin, a Ty wpisałeś " + text);
    }
}
