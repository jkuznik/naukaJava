package jnsp.modul5.e12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        out.println();

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy HH:mm");

        String formattedLocalDateNow= now.format(formatter);

        System.out.println(formattedLocalDateNow);

        System.out.println(now);

        System.out.println();
        System.out.println();


        String dateOfBirth = "15 09 1989 03:12";

        LocalDateTime myBirthDate = LocalDateTime.parse(dateOfBirth, formatter);

        System.out.println(myBirthDate.format(formatter));

//        String dateOfBirth2 = myBirthDate.format(formatter);
//
//        System.out.println(dateOfBirth2);
    }
}
