package jnsp.modul6.e36Exercise.exercise7;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();

        System.out.println("Użytkownicy którzy dodali komentarz dłuższy niż 50 znaków:");

        records.stream()
                .filter(record -> record.comment().length()>50)
                .map(UserActivity::userName)
                .forEach(System.out::println);
    }
}
