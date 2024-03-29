package jnsp.modul6.e03;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("Janusz", "Mariusz", "Dominika", "Michał", "Klaudia", "Julia", "Marcin", "Kasia");

        names.stream()
                .filter(name -> name.endsWith("a"))
                .forEach(System.out::println);
    }
}
