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
        List<String> words = new ArrayList<>();
        List<Double> averageCommentsWordsLength = new ArrayList<>();

        List<String> commentList = records.stream()
                .map(UserActivity::comment)
                .toList();

        for(String comment : commentList){
            String clearComment = comment.replaceAll(",", "")
                    .replaceAll("!", "").replaceAll("\\.", "");

            words.add(clearComment);
        }

        for(String line : words){
            String[] splitedLine = line.split(" ");

            double averageLineWordsLength = Arrays.stream(splitedLine)
                    .collect(Collectors.summarizingDouble(String::length))
                    .getAverage();
            averageCommentsWordsLength.add(averageLineWordsLength);
        }

        Double finalyAvaregeCommentWordLength = averageCommentsWordsLength.stream()
                .collect(Collectors.averagingDouble(Double::doubleValue));

        System.out.println("Średnia ilość znaków każdego słowa wszystkich komentarzy to: " + finalyAvaregeCommentWordLength);
    }
}
