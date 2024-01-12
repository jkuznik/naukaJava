package jnsp.modul6.e36Exercise.exercise19;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();

        double averageLength = records.stream()
                .mapToInt(record -> record.comment().length())
                .average().getAsDouble();

        records.stream()
                .filter(record -> record.comment().length() > averageLength)
                .map(record -> record.userName() + ", " + record.comment())
                .forEach(System.out::println);
    }
}
