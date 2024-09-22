package jnsp.modul6.e36Exercise.exercise2;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();

        records.stream()
                .filter(record -> record.likes() > 10)
                .map((record -> "Polubień: " + record.likes() + "\t" + record.userName() + ": " +  record.comment()))
                .forEach(System.out::println);
    }
}
