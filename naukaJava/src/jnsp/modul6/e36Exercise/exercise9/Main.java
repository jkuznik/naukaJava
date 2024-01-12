package jnsp.modul6.e36Exercise.exercise9;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();

        records.stream()
                .filter(record -> record.date().getMonth().equals(Month.OCTOBER))
                .map(record -> record.date() + ", " + record.comment())
                .forEach(System.out::println);
    }
}
