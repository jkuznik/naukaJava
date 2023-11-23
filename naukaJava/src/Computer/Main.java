package Computer;

import Computer.Drive.HDDDrive;
import Computer.Drive.SSDDrive;
import Computer.UsbDevice.MemoryStick;
import Computer.UsbDevice.Mouse;
import Computer.UsbDevice.USBDevice;

public class Main {

    public static void main(String[] args) {

        Monitor monitor = new Monitor();
//        HDDDrive drive = new HDDDrive();
        SSDDrive drive = new SSDDrive();

/*
        Działanie interface Drive - można tworzyć instancję typu
        Computer za pomocą konstruktora gdzie argument Drive może
        przybierać różne klasy implementujące interface Drive, w tym
        przypadku są to klasy HDDDrive lub SSDDrive
        Interface Drive pozwala na rozszerzenie wyboru typu argumentu
        Drive w przyszłości o nowe technologie
*/


        Computer computer = new Computer(monitor, drive);

//        drive.addFile( new File("naukaJava"));
//        drive.listFiles();
        MemoryStick memoryStick = new MemoryStick("Pendrive");
        MemoryStick memoryStick2 = new MemoryStick("Pendrive2");
        Mouse mouse = new Mouse("Myszka");

        computer.addUSBDevice(memoryStick);
        computer.addUSBDevice(memoryStick2);
        computer.addUSBDevice(mouse);

        computer.getUsbDevices();

        memoryStick.eject();
        computer.removeUSBDevice(memoryStick);
        computer.removeUSBDevice(mouse);

//        for (USBDevice usbDevice : computer.usbDevices){
//            System.out.println(usbDevice.getName());
//        }
//              petla pozwalająca wyświetlić wartości z obiektu typu
//        List<obiekt> = new ArrayList<>();
    }
}
