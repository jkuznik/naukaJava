package jnsp.modul5.e27Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private Path inputFile;

    public FileReader(Path inputFile) {
        this.inputFile = inputFile;
    }

    public List<String> openFile(){
        List<String> inputLines = new ArrayList<>();

        try {
            inputLines = Files.readAllLines(inputFile);
        } catch (IOException e) {
            inputLines.add("Plik do odczytu nie został znaleziony");
            System.out.println(inputLines.getFirst());
        }

        return inputLines;
    }
}
