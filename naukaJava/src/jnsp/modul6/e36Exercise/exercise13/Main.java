package jnsp.modul6.e36Exercise.exercise13;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();

        OptionalDouble average = records.stream()
                .mapToInt(record -> record.comment().length())
                .average();

        double avCommentLength = average.orElse(0.0);

        System.out.println("Średnia długość komentarzy to: " + avCommentLength);
    }
}
