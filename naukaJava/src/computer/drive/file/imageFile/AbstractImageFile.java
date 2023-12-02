package computer.file.imageFile;

import computer.file.AbstractFile;
import computer.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {
    // zaimplementowac metody
    protected String name;
    protected int size;
    protected FileType fileType;

    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }


    @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
