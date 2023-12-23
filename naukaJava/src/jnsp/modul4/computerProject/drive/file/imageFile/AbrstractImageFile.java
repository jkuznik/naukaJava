package jnsp.modul4.computerProject.drive.file.imageFile;

import jnsp.modul4.computerProject.drive.file.AbstractFile;
import jnsp.modul4.computerProject.drive.file.File;
import jnsp.modul4.computerProject.drive.file.FileType;

public class AbrstractImageFile extends AbstractFile implements File {

    public AbrstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getFileType() {
        return FileType.IMAGE;
    }

}
