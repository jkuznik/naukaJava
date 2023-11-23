package Komputer;

public class Monitor {

    private int szerokosc = 3840;
    private int wysokosc = 1920;

    public void getRozdzielczosc(){
        System.out.println("Aktualna rozdzielczosc to " + szerokosc + "x" + wysokosc);
    }

    public void setWysokaRozdzielczosc(){
        szerokosc = 3420;
        wysokosc = 1920;
    }

    public void setNiskaRozdzielczosc(){
        szerokosc = 800;
        wysokosc = 600;
    }


}
