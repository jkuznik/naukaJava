package jnsp.modul4.computerProject.drive.file;

public interface File {

    String getName();
    int getSize();

    FileType getFileType();

    default void showJPEG(){
        System.out.println("Wrong file");
    }

    default void play(){
        System.out.println("Wrong file");
    }

}
