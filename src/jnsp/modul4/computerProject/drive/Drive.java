package jnsp.modul4.computerProject.drive;

import jnsp.modul4.computerProject.utilites.Utilites;
import jnsp.modul4.computerProject.drive.file.File;

public interface Drive extends Utilites {

    void addFile(File file);
    void listFile();
    File findFile(String name);
}
