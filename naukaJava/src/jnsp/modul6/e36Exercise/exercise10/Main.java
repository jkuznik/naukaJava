package jnsp.modul6.e36Exercise.exercise10;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();
        List<LocalDate> uniqeDates = new ArrayList<>();


        List<LocalDate> allDates = records.stream()
                .map(UserActivity::date)
                .toList();
        
        for(LocalDate date : allDates){
            long repetitions = records.stream()
                    .filter(record -> record.date().equals(date))
                    .count();
            if(repetitions==1){
                uniqeDates.add(date);
            }
        }

        List<LocalDate> sortedUniqeDates = uniqeDates.stream()
                .sorted()
                .toList();

        for (LocalDate date : sortedUniqeDates){
            records.stream()
                    .filter(record -> record.date().equals(date))
                    .map(record -> "Unikalna data w której dodano komentarz to: " + record.date())
                    .forEach(System.out::println);
        }

    }
}
