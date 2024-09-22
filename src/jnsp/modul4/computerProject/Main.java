package jnsp.modul4.computerProject;

import jnsp.modul4.computerProject.allInOne.AllInOne;
import jnsp.modul4.computerProject.allInOne.Printer;
import jnsp.modul4.computerProject.allInOne.Scaner;
import jnsp.modul4.computerProject.drive.Drive;
import jnsp.modul4.computerProject.drive.SSDDrive;
import jnsp.modul4.computerProject.drive.file.File;
import jnsp.modul4.computerProject.drive.file.imageFile.JPEGFile;
import jnsp.modul4.computerProject.drive.file.musicFile.MP3MusicFile;
import jnsp.modul4.computerProject.hardware.Computer;
import jnsp.modul4.computerProject.hardware.ComputerFactory;
import jnsp.modul4.computerProject.hardware.Monitor;
import jnsp.modul4.computerProject.usbDevice.Keyboard;
import jnsp.modul4.computerProject.usbDevice.MemoryStick;
import jnsp.modul4.computerProject.usbDevice.Mouse;

import java.util.Scanner;

/**
 * Main class of the application, responsible for creating and interacting with the computer.
 * This class was inspired by the work of Kamil Brzeźiński. The original project
 * can be found at https://github.com/kamilbrzezinski/oop.
 */

public class Main {
    public static void main(String[] args) {

        var computer = ComputerFactory.getComputer();

        computer.showUtilites();

        Scanner scanner = new Scanner(System.in);
        int index;

        System.out.println("Witch utilite remove?");
        index = scanner.nextInt();

        computer.removeUtilites(index);
        computer.showUtilites();
    }
}