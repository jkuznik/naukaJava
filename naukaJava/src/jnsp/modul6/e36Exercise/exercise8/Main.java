package jnsp.modul6.e36Exercise.exercise8;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();

        records.stream()
                .sorted(Comparator.comparing(UserActivity::likes).reversed())
                .map(record -> record.likes() + ", " + record.userName() + ": " + record.comment())
                .forEach(System.out::println);
    }
}
