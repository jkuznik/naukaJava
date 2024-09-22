package jnsp.modul6.e36Exercise.exercise20;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();

        List<LocalDate> allDates = records.stream()
                .map(UserActivity::date)
                .toList();

        final LocalDate maxDate = MaxDate.maxDate(allDates, records);

        records.stream()
                .filter(record -> record.date().equals(maxDate))
                .map(record -> record.date() + String.join(", ", " ", record.userName(), record.comment()))
                .forEach(System.out::println);

    }

}

