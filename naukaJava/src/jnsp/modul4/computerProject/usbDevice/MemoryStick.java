package jnsp.modul4.computerProject.usbDevice;

import jnsp.modul4.computerProject.utilites.UtilitesType;

public class MemoryStick extends USBDeviceAbstract{

    public MemoryStick(String name) {
        super(name);
    }

    @Override
    public UtilitesType getType() {
        return UtilitesType.MEMORYSTICK;
    }
}
