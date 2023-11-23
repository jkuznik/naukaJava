package Komputer;

import java.util.Scanner;

public class Komputer {

    private String nazwa;
    private Scanner scanner = new Scanner(System.in);
    Monitor monitor = new Monitor();
    Dysk dysk = new Dysk();

//    private Sluchawki sluchawki = new Sluchawki();
    Pendrive pendrive = new Pendrive();

    public Komputer(Monitor monitor, Dysk dysk){

        this.monitor = monitor;
        this.dysk = dysk;
    }

    public void addSluchawki(){
        System.out.println("Podłączanie sluchawek\nModel sluchawek to: ");
        nazwa = scanner.nextLine();
        Sluchawki sluchawki = new Sluchawki(nazwa);

    }


}
