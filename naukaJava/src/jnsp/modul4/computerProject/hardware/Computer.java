package jnsp.modul4.computerProject.hardware;

import jnsp.modul4.computerProject.utilites.Utilites;
import jnsp.modul4.computerProject.drive.Drive;
import jnsp.modul4.computerProject.utilites.UtilitiesNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private List<Utilites> utilites = new ArrayList<>();

    public Computer(Monitor monitor, Drive drive){
        System.out.println("Created computer with monitor resolution " + monitor.getResolution() +
                " and " + drive.getUtiliteName());
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

    public Utilites getUtiliteByName(String name) throws UtilitiesNotFoundException {

            for (Utilites utility : utilites) {
                if (utility.getUtiliteName().equals(name)) {
                    return utility;
                }
            }
            throw new UtilitiesNotFoundException("Utilities with name " + name + " not found");
    }
}
