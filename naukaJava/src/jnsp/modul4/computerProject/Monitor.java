package jnsp.modul4.computerProject;

import jnsp.modul4.computerProject.utilites.Utilites;
import jnsp.modul4.computerProject.utilites.UtilitesType;

public class Monitor implements Utilites {

    private int width= 3840;
    private int hight= 1920;

    private String name;

    public Monitor(String name) {
        this.name = name;

    }

    public void setHightResolution(){
        width = 3840;
        hight = 1920;
    }

    public void setLowResolution(){
        width = 800;
        hight = 600;
    }

    public String getResolution(){

        return width+ "x" +hight;
    }

    @Override
    public String getUtiliteName() {
        return name;
    }

    @Override
    public UtilitesType getType() {
        return UtilitesType.MONITOR;
    }
}
