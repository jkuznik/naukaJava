package jnsp.modul4.computerProject.usbDevice;

import jnsp.modul4.computerProject.utilites.UtilitesType;

public abstract class USBDeviceAbstract implements USBDevice{

    protected String name;

    public USBDeviceAbstract(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getUtiliteName() {
        return name;
    }

}
