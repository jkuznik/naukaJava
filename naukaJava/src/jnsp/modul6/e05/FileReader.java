package jnsp.modul6.e05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private static Path path;

    public FileReader(Path path){
        this.path = path;
    }

    public List<String> openFile(){
        List<String> lines = new ArrayList<>();

        try{
            lines = Files.readAllLines(path);
        }catch (IOException e){
            System.out.println("Nie znaleziono pliku do odczytu");
        }

        return lines;
    }


}
