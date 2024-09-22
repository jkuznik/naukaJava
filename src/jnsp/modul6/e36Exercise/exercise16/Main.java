package jnsp.modul6.e36Exercise.exercise16;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();

        records.stream()
                .filter(record -> {
                    String name = record.userName().toLowerCase();
                    return name.startsWith("a");
                })
                .map(record -> record.userName() + ", " + record.comment())
                .forEach(System.out::println);
    }
}
