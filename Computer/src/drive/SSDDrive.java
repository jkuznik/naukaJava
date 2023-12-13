package drive;

import drive.file.File;
import utilites.UtilitesType;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SSDDrive implements Drive{

    private String name;
    private Map<String, File> files = new HashMap<>();


    public SSDDrive(String name) {
        this.name = name;
    }

    @Override
    public void addFile(File file) {
        files.put(file.getName(),file);
    }

    @Override
    public void listFile() {
        Collection<File> fileCollection = files.values();

        for (File file : fileCollection) {
            System.out.println(file.getName());
        }

    }

    @Override
    public File findFile(String name) {
        return files.get(name);
    }

    @Override
    public String getUtiliteName() {
        return name;
    }

    @Override
    public UtilitesType getType() {
        return UtilitesType.HARDDRIVE;
    }
}
