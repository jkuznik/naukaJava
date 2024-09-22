package jnsp.modul5.e27Exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileOverwriter {

    Path path;

    public FileOverwriter(Path path) {
        this.path = path;
    }

    public void overwriteFile(List<String> inputLines){

        List<String> outputLines = new ArrayList<>();

        for(String line : inputLines){
            if(line.startsWith("A") || line.startsWith("a")){
                outputLines.add(line);
            }
        }

        try{
            Files.write(path, outputLines, StandardOpenOption.WRITE);
        } catch (IOException e) {
            System.out.println("Plik do zapisu nie został znaleziony");
        }

    }
}
