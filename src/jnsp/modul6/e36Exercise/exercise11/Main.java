package jnsp.modul6.e36Exercise.exercise11;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();

        long novemberSummaryLikes = records.stream()
                .filter(record -> record.date().getMonth().equals(Month.NOVEMBER))
                .collect(Collectors.summarizingInt(UserActivity::likes))
                .getSum();

        System.out.println("Liczba komentarzy dodanych w listopadzie to: " + novemberSummaryLikes);
    }
}
