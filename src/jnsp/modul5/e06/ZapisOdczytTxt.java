package jnsp.modul5.e06;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ZapisOdczytTxt {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/jnsp/modul5/e06/Plik.txt");

        List<String> lines = Files.readAllLines(path);

        for( String line : lines) {
            System.out.println(line);
        }
        System.out.println();
        System.out.println();
        System.out.println();

        List<String> myWords = new ArrayList<>();

        myWords.add(System.lineSeparator() + "Imię: Bogusław");
        myWords.add("Nazwisko: Linda");

        Files.write(path, myWords, StandardOpenOption.WRITE);

        List<String> lines2 = Files.readAllLines(path);

        for( String line : lines2) {
            System.out.println(line);
        }

//        Path path1 = Paths.get("/Users/janus/Documents/ADOM/adom_dat/adom.log");
//        Path path1 = Paths.get("C:\\Users\\janus\\Documents\\ADOM\\adom_dat\\adom.log");
//
//        List<String> lines1 = Files.readAllLines(path1);
//
//        for( String line : lines1) {
//            System.out.println(line);
//        }
    }
}
