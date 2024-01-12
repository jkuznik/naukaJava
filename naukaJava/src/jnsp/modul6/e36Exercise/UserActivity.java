package jnsp.modul6.e36Exercise.exercise1;

import java.time.LocalDate;

public record UserActivity(String userName, String comment, LocalDate date, int likes) {
}
