package jnsp.modul6.e36Exercise.exercise17;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();

        records.stream()
                .map(UserActivity::comment)
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(5)
                .forEach(System.out::println);

    }
}
