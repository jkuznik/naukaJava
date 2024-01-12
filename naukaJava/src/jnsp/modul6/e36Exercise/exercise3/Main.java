package jnsp.modul6.e36Exercise.exercise3;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();

        records.stream()
                .max(Comparator.comparing(record -> record.comment().length()))
                .stream()
                .map(record -> "Najdłuższy komentarz to: \n " + record.comment())
                .forEach(System.out::println);

        System.out.println();

        records.stream()
                .min(Comparator.comparing(record -> record.comment().length()))
                .stream()
                .map(record -> "Najkrótszy komentarz to: \n " + record.comment())
                .forEach(System.out::println);



    }
}
