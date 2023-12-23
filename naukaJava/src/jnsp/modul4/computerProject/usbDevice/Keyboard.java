package jnsp.modul4.computerProject.usbDevice;

import jnsp.modul4.computerProject.utilites.UtilitesType;

public class Keyboard extends USBDeviceAbstract {
    public Keyboard(String name) {
        super(name);
    }

    @Override
    public UtilitesType getType() {
        return UtilitesType.KEYBOARD;
    }
}
