package jnsp.modul6.e04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrepareData {
    public static void main(String[] args) {

        String inputValue;
        Scanner scanner = new Scanner(System.in);

        List<String> lines = new ArrayList<>();
        Path path = Paths.get("src/jnsp/modul6/e04/data.txt");

        do{
            System.out.println("Wprowadź użytkownika:");
            System.out.println("Nazwa użytkownika: ");
            inputValue = "USER_NAME: " + scanner.nextLine() + ";";
            lines.add(inputValue);

            System.out.println("Wiek: ");
            inputValue = "AGE: " + scanner.nextLine() + ";";
            lines.add(inputValue);

            System.out.println("Umiejętności: ");
            inputValue = "SKILLS: " + scanner.nextLine() + ";";
            lines.add(inputValue);

            System.out.println("Czy jest aktywny: ");
            inputValue = "IS_ACTIV: " + scanner.nextLine() + ";" + System.lineSeparator();
            lines.add(inputValue);

            System.out.println("[W]prowadź nowego użytkownik lub [Z]akończ");
            inputValue = scanner.nextLine();
        }while(!inputValue.endsWith("Z"));

        try{
            Files.write(path, lines, StandardOpenOption.APPEND );
        }catch (IOException e){
            System.out.println("Nie znaleziono pliku");
        }

    }
}
