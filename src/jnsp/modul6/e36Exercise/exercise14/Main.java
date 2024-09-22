package jnsp.modul6.e36Exercise.exercise14;

import jnsp.modul6.e36Exercise.DataFormater;
import jnsp.modul6.e36Exercise.UserActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<UserActivity> records = DataFormater.formatToRecord();
        List<Long> wordsInEverComment = new ArrayList<>();

        List<String> commentList = records.stream()
                .map(UserActivity::comment)
                .toList();

        for(String word : commentList){
            String[] words = word.split(" ");
            long wordsCounter = Arrays.stream(words).count();
            wordsInEverComment.add(wordsCounter);
        }

        Double averageWordsInEverComment = wordsInEverComment.stream()
                .collect(Collectors.averagingLong(Long::longValue));

        System.out.println("Średnia ilość słów w komentarzach to: " + averageWordsInEverComment);


    }
}
