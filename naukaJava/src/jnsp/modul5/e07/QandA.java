package jnsp.modul5.e07;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QandA {


    public QandA() throws IOException {
    }

    public void startQuiz(Path path) throws IOException {

        Path answerPath = Paths.get("src/jnsp/modul5/e07/results.txt");

        List<String> questions = Files.readAllLines(path);
        List<String> results = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String userAnswer;
        String rightAnswer;

        int points=0;

        for ( String question : questions){
            rightAnswer = "" + question.charAt(question.length()-1);

            String[] splitedQuestion = question.split(";");

            System.out.println(splitedQuestion[0]);
            System.out.println("1. "+splitedQuestion[1]);
            System.out.println("2. "+splitedQuestion[2]);
            System.out.println("3. "+splitedQuestion[3]);
            System.out.println("4. "+splitedQuestion[4]);
            System.out.println();

            System.out.println("Twoja odpowiedź to:");
            userAnswer = scanner.nextLine();

            if(userAnswer.equals(rightAnswer)) {
                System.out.print(" \t Dobra odpowiedź");
                System.out.println();
                points++;
            } else {
                System.out.println("Zła odpowiedź ");
                System.out.println("Prawidłowa odpowiedź to " + splitedQuestion[5] + " - " +
                        splitedQuestion[Integer.parseInt(splitedQuestion[5])]);
                System.out.println();
            }
        }

        results.add("Wynik " + points);

        Files.write(answerPath, results, StandardOpenOption.APPEND);
    }

}
