package drive;

import utilites.Utilites;
import drive.file.File;

public interface Drive extends Utilites {

    void addFile(File file);
    void listFile();
    File findFile(String name);
}
