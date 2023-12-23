package jnsp.modul4.computerProject.drive.file.imageFile;

public class GIFFile extends AbrstractImageFile{

    private int time;

    public GIFFile(String name, int size, int time) {
        super(name, size);
        this.time = time;
    }

    public void showGIF(){
        System.out.println("Showing gif " + getName() +". RunTime is " + time);
    }
}
