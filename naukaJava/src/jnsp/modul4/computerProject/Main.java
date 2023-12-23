package jnsp.modul4.computerProject;

import jnsp.modul4.computerProject.allInOne.AllInOne;
import jnsp.modul4.computerProject.allInOne.Printer;
import jnsp.modul4.computerProject.allInOne.Scaner;
import jnsp.modul4.computerProject.drive.HDDDrive;
import jnsp.modul4.computerProject.drive.Drive;
import jnsp.modul4.computerProject.drive.SSDDrive;
import jnsp.modul4.computerProject.drive.file.File;
import jnsp.modul4.computerProject.drive.file.imageFile.JPEGFile;
import jnsp.modul4.computerProject.drive.file.musicFile.MP3MusicFile;
import jnsp.modul4.computerProject.usbDevice.Keyboard;
import jnsp.modul4.computerProject.usbDevice.MemoryStick;
import jnsp.modul4.computerProject.usbDevice.Mouse;

import java.util.Scanner;

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

        File image1 = new JPEGFile("Plakat", 14, 60);
        drive.addFile(image1);

        File sound1 = new MP3MusicFile("Muza", 58, "Golec uOrkiestra", "Słodycze", 95);
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

        Scanner scanner = new Scanner(System.in);
        int index;

        System.out.println("Witch utilite remove?");
        index = scanner.nextInt();

        computer.removeUtilites(index);

        computer.showUtilites();



    }
}