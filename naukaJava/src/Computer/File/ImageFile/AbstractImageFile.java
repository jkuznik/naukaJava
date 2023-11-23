package Computer.File.ImageFile;

import Computer.File.File;
import Computer.File.FileType;

public abstract class AbstractImageFile implements File {
    // zaimplementowac metody
    protected String name;
    protected int size;
    protected FileType fileType;

    public AbstractImageFile(String name, int size) {
        this.name = name;
        this.size = size;
    }


}
