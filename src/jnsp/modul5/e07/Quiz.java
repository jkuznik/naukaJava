package jnsp.modul5.e07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.StandardOpenOption;


public class Quiz {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("src/jnsp/modul5/e07/quiz.txt");

        QandA quiz1 = new QandA();

        quiz1.startQuiz(path);
    }
}
