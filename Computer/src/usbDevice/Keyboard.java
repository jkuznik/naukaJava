package usbDevice;

import utilites.UtilitesType;

public class Keyboard extends USBDeviceAbstract {
    public Keyboard(String name) {
        super(name);
    }

    @Override
    public UtilitesType getType() {
        return UtilitesType.KEYBOARD;
    }
}
