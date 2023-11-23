package Computer.Drive;

import Computer.File.File;

public interface Drive {
    void addFile(File file);
    void listFiles();

    File findFile(String name);
}
