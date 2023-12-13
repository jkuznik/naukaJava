package usbDevice;

import utilites.UtilitesType;

public class MemoryStick extends USBDeviceAbstract{

    public MemoryStick(String name) {
        super(name);
    }

    @Override
    public UtilitesType getType() {
        return UtilitesType.MEMORYSTICK;
    }
}
