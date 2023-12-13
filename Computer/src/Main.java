import allInOne.AllInOne;
import allInOne.Printer;
import allInOne.Scaner;
import drive.HDDDrive;
import drive.Drive;
import drive.SSDDrive;
import drive.file.imageFile.JPEGFile;
import drive.file.musicFile.MP3MusicFile;
import usbDevice.Keyboard;
import usbDevice.MemoryStick;
import usbDevice.Mouse;

public class Main {
    public static void main(String[] args) {

        Monitor monitor = new Monitor("Dualtec");
//        Drive drive = new HDDDrive("STD500GB");
        Drive drive = new SSDDrive("STD1000GB");

        Computer computer = new Computer(monitor, drive);

        AllInOne printer = new Printer("HP", 1200);
        AllInOne scaner = new Scaner("Lenovo", 1999);

        Headphones headphones = new Headphones("Lenovo Thinkplus xt92", 98);

        Mouse mouse = new Mouse("Tracer");
        MemoryStick pendrive = new MemoryStick("ExtraSpace");
        Keyboard keyboard = new Keyboard("Tracer");

        /**
         *      ALl above - making HARDWARE
         *      ALL below - making SOFTWARE
         *                                  */

        JPEGFile image1 = new JPEGFile("Plakat", 14, 60);
        drive.addFile(image1);

        MP3MusicFile sound1 = new MP3MusicFile("Hymn", 58, "Dąbrowski", "Marsz Dąbrowsiego", 95);
        drive.addFile(sound1);

        sound1.play();
        image1.showJPEG();

        drive.listFile();
        System.out.println();

        computer.addUtilites(monitor);
        computer.addUtilites(drive);
        computer.addUtilites(printer);
        computer.addUtilites(scaner);
        computer.addUtilites(headphones);
        computer.addUtilites(mouse);
        computer.addUtilites(pendrive);
        computer.addUtilites(keyboard);


        computer.showUtilites();

    }
}