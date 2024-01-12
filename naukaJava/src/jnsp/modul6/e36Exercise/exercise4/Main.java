package jnsp.modul6.e36Exercise.exercise4;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();

        Double avLikes = records.stream()
                .collect(Collectors.averagingInt(UserActivity::likes));

        System.out.println("Średnia liczba polubień dla wszystkich komentarzy to " + avLikes);



    }
}
