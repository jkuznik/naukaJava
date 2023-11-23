package Computer.File.ImageFile;

import Computer.File.File;
import Computer.File.FileType;

public class JPGImageFile implements File {
    String name;
    int size;
    int compression;
    private final FileType fileType;


    public JPGImageFile(String name, int size, FileType fileType, int compression ) {
        this.name = name;
        this.size = size;
        this.fileType = fileType;
        this.compression = compression;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public FileType getType() {
        return null;
    }

    public int getCompression() {
        return compression;
    }

    public void displayImage(){
        System.out.println("Showing image");
    }
}
