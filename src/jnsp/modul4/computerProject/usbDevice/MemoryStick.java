package jnsp.modul4.computerProject.usbDevice;

import jnsp.modul4.computerProject.drive.file.File;
import jnsp.modul4.computerProject.utilites.UtilitesType;

import java.util.ArrayList;
import java.util.List;

public class MemoryStick extends USBDeviceAbstract{

    private List<File> files = new ArrayList<>();

    public MemoryStick(String name) {
        super(name);
    }

    @Override
    public UtilitesType getType() {
        return UtilitesType.MEMORYSTICK;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public List<File> getFiles() {
        return files;
    }
}
