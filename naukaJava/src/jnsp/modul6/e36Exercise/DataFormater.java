package jnsp.modul6.e36Exercise.exercise1;

import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class DataFormater {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static LocalDate date;

    public static List<UserActivity> formatToRecord(Path path) {
        List<String> inputData = FileReader.openFile(path);

        List<UserActivity> records = inputData.stream()
                .map(line -> {

                    String[] splitedLine = line.split(";");
                    try {
                        LocalDate inputDate = LocalDate.parse(splitedLine[2], formatter);
                        date = inputDate;
                    } catch (Exception e) {
                        System.out.println("Błąd podczas parsowania daty " + splitedLine[1] + ", " + splitedLine[2]);
                    }
                    return new UserActivity(splitedLine[0], splitedLine[1], date, Integer.parseInt(splitedLine[3]));
                })
                .toList();

        return records;
    }
}
