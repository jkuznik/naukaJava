package jnsp.modul5.e10Exercise;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String date ="";
        List<String> userDate = new ArrayList<>();
        int extraDays=0;

        Scanner scanner = new Scanner(System.in);

        LocalDate now = LocalDate.now();

        System.out.println("Podaj datę urodzenia");
        System.out.println("Rok: ");
        userDate.add(scanner.nextLine());

        System.out.println("Miesiąc: ");
        userDate.add(scanner.nextLine());

        System.out.println("Dzień: ");
        userDate.add(scanner.nextLine());

        date = date.join("-", userDate);

        LocalDate dateOfBirth = LocalDate.parse(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy");
        dateOfBirth.format(formatter);

        Period period = Period.between(dateOfBirth, now);

        for(int i = dateOfBirth.getYear(); i < now.getYear(); i++){
            if ((i % 4 == 0) && !(i % 100 == 0) || (i % 400 == 0)){
                extraDays++;
            }
        }
        if(((now.getYear() % 4 == 0) && !(now.getYear() % 100 == 0) || (now.getYear() % 400 == 0)) && !now.getMonth().equals(Month.JANUARY) && !now.getMonth().equals(Month.FEBRUARY)) extraDays++;

        System.out.println("Urodziłeś się " + dateOfBirth.format(formatter) +", a dzisiaj mamy " + now.format(formatter));
        System.out.println("Od dnia kiedy się urodziłeś mineło " + period.getYears() + " lat, " +
                "" + period.getMonths() + " miesięcy, " + period.getDays() + " dni.");

        long daysCount = ChronoUnit.DAYS.between(dateOfBirth, now);

        System.out.println("Żyjesz już " + daysCount + " dni");

    }
}
