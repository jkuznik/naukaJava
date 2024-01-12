package jnsp.modul6.e36Exercise.exercise12;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();
        List<String> uniqeNames = new ArrayList<>();


        List<String> names = records.stream()
                .map(UserActivity::userName)
                .toList();

        for(String name : names){
            long repetitions = records.stream()
                    .filter(record -> record.userName().equals(name))
                    .count();
            if(repetitions==1){
                uniqeNames.add(name);
            }

            System.out.println("Nazwy użytkowników które się nie powtarzają to: ");
            uniqeNames.stream()
                    .sorted()
                    .forEach(System.out::println);

        }
    }
}
