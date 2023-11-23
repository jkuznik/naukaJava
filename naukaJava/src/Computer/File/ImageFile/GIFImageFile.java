package Computer.File.ImageFile;

import Computer.File.File;
import Computer.File.FileType;

public class GIFImageFile implements File {
    String name;
    int size;
    private final FileType fileType;

    public GIFImageFile(String name, int size, FileType fileType) {

        this.name = name;
        this.size = size;
        this.fileType = fileType;
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public FileType getType() {
        return null;
    }
    public void showAnimation() {
        System.out.println("Showing funny gif");
    }
}
