import utilites.Utilites;
import drive.Drive;

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
    public void showUtilites(){
        for(Utilites allUtilitesList : utilites){
            System.out.println(allUtilitesList.getUtiliteName() + " " + allUtilitesList.getType());

        }

    }
}
