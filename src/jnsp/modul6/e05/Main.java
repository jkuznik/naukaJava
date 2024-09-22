package jnsp.modul6.e05;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Path path = Paths.get("src/jnsp/modul6/e04PreparedData/data.txt");

        FileReader fileReader = new FileReader(path);

        List<String> lines = fileReader.openFile();

        for(String line : lines){
            System.out.println(line);
        }





    }
}
