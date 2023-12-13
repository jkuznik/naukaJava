package drive.file.imageFile;

import drive.file.AbstractFile;
import drive.file.File;
import drive.file.FileType;

public class AbrstractImageFile extends AbstractFile implements File {

    public AbrstractImageFile(String name, int size) {
        super(name, size);
    }

    @Override
    public FileType getFileType() {
        return FileType.IMAGE;
    }
}
