package jnsp.modul5.e12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("d'th' MMMM yyyy");

        String date2 = "5th Września 2020";
        LocalDate parsedDate = LocalDate.parse(date2, formatter1);
        out.println(date2);
    }
}
