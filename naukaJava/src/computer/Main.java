package computer;

import computer.drive.SSDDrive;
import computer.file.File;
import computer.file.imageFile.GIFImageFile;
import computer.file.imageFile.JPGImageFile;
import computer.file.musicfile.MP3MusicFile;
import computer.usbDevice.MemoryStick;
import computer.usbDevice.Mouse;

public class Main {

    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("nazwa1.gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 30, 80);
        MP3MusicFile mp3one = new MP3MusicFile("nazwa1.mp3", 5000, "Marlin", " Heaven", 100);
        JPGImageFile jpg2 = new JPGImageFile("nazwa2.jpg", 200, 50);
        MP3MusicFile mp3two = new MP3MusicFile("aanazwa2.mp3", 5000, "golec uorkiestra", "Slodycze", 95);

        SSDDrive drive1 = new SSDDrive();

        drive1.addFile(gif1);
        drive1.addFile(jpg1);
        drive1.addFile(mp3one);
        drive1.addFile(jpg2);
        drive1.addFile(mp3two);


        drive1.listFiles();


//        File file = drive1.findFile("nazwa1.jpg");
//        System.out.println(file.getName());


//        Monitor monitor = new Monitor();
////        HDDDrive drive = new HDDDrive();

//        SSDDrive drive = new SSDDrive();
//
///*
//        Działanie interface Drive - można tworzyć instancję typu
//        Computer za pomocą konstruktora gdzie argument Drive może
//        przybierać różne klasy implementujące interface Drive, w tym
//        przypadku są to klasy HDDDrive lub SSDDrive
//        Interface Drive pozwala na rozszerzenie wyboru typu argumentu
//        Drive w przyszłości o nowe technologie
//*/
//
//
//        Computer computer = new Computer(monitor, drive);
//
////        drive.addFile( new File("naukaJava"));
////        drive.listFiles();
//        MemoryStick memoryStick = new MemoryStick("Pendrive");
//        MemoryStick memoryStick2 = new MemoryStick("Pendrive2");
//        Mouse mouse = new Mouse("Myszka");
//
//        computer.addUSBDevice(memoryStick);
//        computer.addUSBDevice(memoryStick2);
//        computer.addUSBDevice(mouse);
//
//        computer.getUsbDevices();
//
//        memoryStick.eject();
//        computer.removeUSBDevice(memoryStick);
//        computer.removeUSBDevice(mouse);
//
//
//        Headphones headphones = new Headphones("Lenovo ThinkPlus");
//
//        System.out.println(headphones.getHeadphonesName());
//
////        for (USBDevice usbDevice : computer.usbDevices){
////            System.out.println(usbDevice.getName());
////        }
////              petla pozwalająca wyświetlić wartości z obiektu typu
////        List<obiekt> = new ArrayList<>();
    }
}
