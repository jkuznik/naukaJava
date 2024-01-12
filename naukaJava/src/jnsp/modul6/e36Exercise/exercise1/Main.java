package jnsp.modul6.e36Exercise.exercise1;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();

        records.stream()
                .sorted(Comparator.comparing(UserActivity::date))
                .map(record -> {

                    String newRecord = String.join(", ", record.date().toString(), record.userName(),
                            record.comment() + " Polubień: " + record.likes());
                    return newRecord;

                })
                .forEach(System.out::println);



    }
}
