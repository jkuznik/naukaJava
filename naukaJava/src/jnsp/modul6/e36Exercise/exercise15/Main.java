package jnsp.modul6.e36Exercise.exercise15;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();

        records.stream()
                .filter( record -> {
                    String[] words = record.comment().split(" ");
                    return Arrays.stream(words).anyMatch(word -> word.startsWith("s"));
                })
                .map(UserActivity::comment)
                .forEach(System.out::println);

    }
}
