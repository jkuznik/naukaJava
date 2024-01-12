package jnsp.modul6.e36Exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private static Path path = Paths.get("src/jnsp/modul6/e36Exercise/data.txt");

//    private Path path;
//    private List<String> inputData = new ArrayList<>();
//
//    public FileReader(Path path){
//        this.path = path;
//    }

//    openFile zmieniono na metodę statyczną, konstruktor i pola klasy są zbędne

    public static List<String> openFile(){
        List<String> inputData = new ArrayList<>();

        try{
            inputData = Files.readAllLines(path);
        }catch (IOException e){
            System.out.println("Nie odnaleziono pliku do odczytu");
        }

        inputData.remove(0);

        return inputData;
    }
}
