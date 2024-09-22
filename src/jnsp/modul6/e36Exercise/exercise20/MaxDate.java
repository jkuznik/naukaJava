package jnsp.modul6.e36Exercise.exercise20;

import jnsp.modul6.e36Exercise.UserActivity;

import java.time.LocalDate;
import java.util.List;

public class MaxDate {

    public static LocalDate maxDate(List<LocalDate> dates, List<UserActivity> records){

        long currentMax=0;
        LocalDate currentMaxDate = LocalDate.now();

        for(LocalDate date : dates){
            long repetition = records.stream()
                    .filter(record -> record.date().equals(date))
                    .count();
            if(repetition > currentMax){
                currentMax = repetition;
                currentMaxDate = date;
            }
        }
        return currentMaxDate;
    }
}
