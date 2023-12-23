package jnsp.modul4.computerProject.drive.file.imageFile;

public class JPEGFile extends AbrstractImageFile{

    private int compresion;

    public JPEGFile(String name, int size, int compresion) {
        super(name, size);
        this.compresion = compresion;
    }
    @Override
    public void showJPEG(){
        System.out.println("Print " + getName() + " file. Compresion is "+ compresion);
    }
}
