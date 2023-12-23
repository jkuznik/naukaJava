package jnsp.modul4.computerProject;

import jnsp.modul4.computerProject.utilites.Utilites;
import jnsp.modul4.computerProject.drive.Drive;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private List<Utilites> utilites = new ArrayList<>();

    public Computer(Monitor monitor, Drive drive){
        System.out.println("Created computer with monitor resolution " + monitor.getResolution());
    }

    public void addUtilites(Utilites newUtilites){
        utilites.add(newUtilites);
    }

    public void removeUtilites(int index){
        utilites.remove(index-1);
    }
    public void showUtilites(){
        int i=0;
        for(Utilites allUtilitesList : utilites){
            System.out.println((i+1) + " " +allUtilitesList.getUtiliteName() + "\t\t " + allUtilitesList.getType());
            i++;
        }

    }
}
