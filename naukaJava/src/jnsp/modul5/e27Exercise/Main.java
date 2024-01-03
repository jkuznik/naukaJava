package jnsp.modul5.e27Exercise;

import java.nio.file.Path;
import java.nio.file.Paths;
public class Main {
    public static void main(String[] args) {

        Path inputFile = Paths.get(/*"src/jnsp/modul5/e27Exercise/" +*/ args[0]);
        Path outputFile = Paths.get(/*"src/jnsp/modul5/e27Exercise/" +*/ args[1]);

//        Path inputFile = Paths.get("src/jnsp/modul5/e27Exercise/plikWejsciowy.txt");
//        Path outputFile = Paths.get("src/jnsp/modul5/e27Exercise/plikWyjsciowy.txt");

        FileReader inputData = new FileReader(inputFile);
        FileOverwriter outputData = new FileOverwriter(outputFile);

        outputData.overwriteFile(inputData.openFile());

    }
}
