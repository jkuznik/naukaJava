package usbDevice;

import utilites.UtilitesType;

public class Mouse extends USBDeviceAbstract{

    public Mouse(String name) {
        super(name);
    }

    @Override
    public UtilitesType getType() {
        return UtilitesType.MOUSE;
    }
}
