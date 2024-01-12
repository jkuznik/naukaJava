package jnsp.modul6.e36Exercise.exercise5;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();

        long maleComments = records.stream()
                .filter(record -> !record.userName().endsWith("a"))
                .count();

        long femaleComments = records.stream()
                .filter(record -> record.userName().endsWith("a"))
                .count();

        System.out.println("Ilość komentarzy dodanych przez mężczyzn to " + maleComments);
        System.out.println("Ilość komentarzy dodanych przez kobiety to " + femaleComments);
    }
}
