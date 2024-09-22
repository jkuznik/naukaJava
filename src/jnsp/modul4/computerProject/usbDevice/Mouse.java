package jnsp.modul4.computerProject.usbDevice;

import jnsp.modul4.computerProject.utilites.UtilitesType;

public class Mouse extends USBDeviceAbstract{

    public Mouse(String name) {
        super(name);
    }

    @Override
    public UtilitesType getType() {
        return UtilitesType.MOUSE;
    }
}
