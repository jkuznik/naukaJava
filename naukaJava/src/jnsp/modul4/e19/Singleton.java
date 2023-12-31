package jnsp.modul4.e19;

public class Singleton {

    private static Singleton INSTANCE;

    private Singleton(){

    }

    public static Singleton getINSTANCE() {
        if( INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
