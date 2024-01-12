package jnsp.modul6.e36Exercise.exercise6;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();

        long summaryLikes = records.stream()
                .collect(Collectors.summarizingInt(UserActivity::likes))
                        .getSum();

        System.out.println("Łączna ilość polubień dla wszystkich komentarzy to " + summaryLikes);


    }
}
