package drive;

import drive.file.File;
import utilites.UtilitesType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HDDDrive implements Drive{

    private String name;
    private List<File> files = new ArrayList<>();

    public HDDDrive(String name) {
        this.name = name;
    }

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void listFile() {
        for(File file : files){
            System.out.println(file.getName());
        }

    }

    @Override
    public File findFile(String name) {
        Optional<File> foundFile = files.stream()
                .filter(file -> file.getName().equals(name))
                .findFirst();

        return foundFile.orElseThrow();
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
