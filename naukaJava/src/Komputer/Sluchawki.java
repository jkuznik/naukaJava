package Komputer;

import java.util.Scanner;

public class Sluchawki {

    private String name;
    private Scanner scanner = new Scanner(System.in);


    public Sluchawki(){

    }
    public Sluchawki(String name){
        this.name = name;

    }

    public void getNazwa(){
        System.out.println("Model słuchawek to " + name);
    }

    public void setNazwa(){
        System.out.println("Zmiana sluchawek na nowe...\nNowy model to: ");
        name = scanner.nextLine();
        this.name = name;
    }

}
