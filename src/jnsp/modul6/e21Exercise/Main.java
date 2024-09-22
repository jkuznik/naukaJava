package jnsp.modul6.e21Exercise;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<User> users = prepareData();

//        1. Wyświetl imiona użytkowników którzy znają Jave

        System.out.println("\t\t\tZadanie 1");
        System.out.println();

        users.stream()
                .filter(user -> user.skills().contains("Java"))
                .map(User::name)
                .forEach(System.out::println);

//        2. Wyświetl imiona oraz wiek nieaktywnych użytkowników

        System.out.println();
        System.out.println("\t\t\tZadanie 2");
        System.out.println();

        users.stream()
                .filter(user -> !user.isActive())
                .map(user -> user.name() + ", " + user.age())
                .forEach(System.out::println);

//        3. Znajdź użytkowników, którzy znają conajmniej 4 języki,
//          wyświetl imiona tych użytkowników oraz języki które znają

        System.out.println();
        System.out.println("\t\t\tZadanie 3");
        System.out.println();

        users.stream()
                .filter(user -> user.skills().size() >= 4)
                .map(user -> user.name() + " potrafi " + String.join(", ", user.skills()))
                .forEach(System.out::println);

//        4. Znajdź użytkownika który zna najwięcej technologii, wyświetl jego imię oraz listę technologii

        System.out.println();
        System.out.println("\t\t\tZadanie 4");
        System.out.println();

        Optional<User> highestQualificationUser = users.stream()
                .max(Comparator.comparing(user -> user.skills().size()));

        System.out.println(highestQualificationUser.get().name() + ": " + String.join(", ", highestQualificationUser.get().skills() ));

//        5. Wyświetl średni wiek atywnych użytkowników

        System.out.println();
        System.out.println("\t\t\tZadanie 5");
        System.out.println();

        Double averageAgeOfActiveUsers = users.stream()
                .filter(User::isActive)
                .collect(Collectors.averagingDouble(User::age));

        List<String> activeUsers = users.stream()
                .filter(User::isActive)
                .map(user -> user.name() + ", " + user.age())
                .toList();

        System.out.println("Atywni użytkownicy to: \n" + String.join( " \n", activeUsers));
        System.out.println("Średnia wieku aktywnych użytkowników to: " +  averageAgeOfActiveUsers);

//        6. Wyświetl średnią wieku nieaktywnych użytkowników

        System.out.println();
        System.out.println("\t\t\tZadanie 6");
        System.out.println();

        Double averageAgeOfNoActiveUsers = users.stream()
                .filter(user -> !user.isActive())
                .collect(Collectors.averagingDouble(User::age));

        List<String> noActiveUsers = users.stream()
                .filter(user -> !user.isActive())
                .map(user -> user.name() + ", " + user.age())
                .toList();

        System.out.println("Nie aktywni użytkownicy to: \n" + String.join( " \n", noActiveUsers));
        System.out.println("Średnia wieku tych użytkowników to: " +  averageAgeOfNoActiveUsers);

//        7. Wyświetl ile średnio technologii zna użytkownik

        System.out.println();
        System.out.println("\t\t\tZadanie 7");
        System.out.println();

        OptionalDouble averageSkills = users.stream()
                .mapToInt(user -> user.skills().size())
                .average();

        Double aveSkills = averageSkills.getAsDouble();

        System.out.println("Średnia ilość znanych technologii przez wszystkich użytkowników to: " + aveSkills);

//        8. Podziel użytkowników na znających Jave oraz nie znających, wyświetl imiona oraz posiadane umiejętności
//        obu grup

        System.out.println();
        System.out.println("\t\t\tZadanie 8");
        System.out.println();

        List<String> withJava = users.stream()
                .filter(user -> user.skills().contains("Java"))
                .map(user -> user.name() + ": " + String.join(", ", user.skills()))
                .toList();

        List<String> withoutJava = users.stream()
                .filter(user -> !user.skills().contains("Java"))
                .map(user -> user.name() + ": " + String.join(", ", user.skills()))
                .toList();

        System.out.println("Użytkownicy z znajomością Javy:");
        System.out.println();
        for (String user : withJava){
            System.out.println(user);
        }

        System.out.println();
        System.out.println("Użytkownicy bez znajomości Javy:");
        System.out.println();

        for (String user : withoutJava){
            System.out.println(user);
        }

//        9. Sprawdź czy wszyscy użytkownicy mają więcej niż 18 lat

        System.out.println();
        System.out.println("\t\t\tZadanie 9");
        System.out.println();

        boolean allMatch18 = users.stream()
                .anyMatch(user -> user.age() > 18);

        if(allMatch18){
            System.out.println("Wszyscy użytkownicy mają 18 lat");
        } else System.out.println("Nie wszyscy użytkownicy mają 18 lat");

//        10. Sprawdź czy istnieje użytkownik który ma 40 lub więcej lat

        System.out.println();
        System.out.println("\t\t\tZadanie 10");
        System.out.println();

        boolean over40 = users.stream()
                .anyMatch(user -> user.age() >= 40);

        System.out.println("Czy jest ktoś kto ma 40 lat - " + over40);

//        11. Znajdź najstaszego użytkownika który zna Jave

        System.out.println();
        System.out.println("\t\t\tZadanie 11");
        System.out.println();

        Optional<User> javaOldestUser = users.stream()
                .filter(user -> user.skills().contains("Java"))
                .max(Comparator.comparing(User::age));

        javaOldestUser.stream()
                .map(user -> user.name() + ", " + user.age() + ": "+ String.join(", ", user.skills()))
                .forEach(System.out::println);

//        12. Znajdź użytkowników znających języki których nazwy zaczynają się na literę "P"
//        wyświetl imiona oraz technologie tych użytkowników

        System.out.println();
        System.out.println("\t\t\tZadanie 12");
        System.out.println();

        users.stream()
                .filter(user -> user.skills().stream().anyMatch(skill -> skill.startsWith("P")))
                .map(user -> user.name() + ": " + String.join(", ", user.skills()))
                .forEach(System.out::println);

//        13. Utwórz mapę która jako klucz otrzyma imię użytkownika, a jako wartość liczbę technologii
//        które zna

        System.out.println();
        System.out.println("\t\t\tZadanie 13");
        System.out.println();

        Map<String, List<String>> skillsMap = users.stream()
                .collect(Collectors.toMap(
                        user -> user.name(),
                        user -> user.skills()
                ));

        Map<String, Integer> skillSize = users.stream()
                .collect(Collectors.toMap(
                        user -> user.name(),
                        user -> user.skills().size()
                ));

        String userName = "Janusz";
        System.out.println(userName + " " + skillSize.get(userName) + " " + String.join(", ", skillsMap.get(userName)));
        userName = "Klaudia";
        System.out.println(userName + " " + skillSize.get(userName) + " " + String.join(", ", skillsMap.get(userName)));
        userName = "Kuba";
        System.out.println(userName + " " + skillSize.get(userName) + " " + String.join(", ", skillsMap.get(userName)));

//        14. Wybierz z podanej listy słowa które są palindromami

        System.out.println();
        System.out.println("\t\t\tZadanie 14");
        System.out.println();

        List<String> words = List.of("kajak", "maja", "oko", "stół", "zakopane na pokaz", "zakopanenapokaz", "anna");

        words.stream()
                .filter( word -> word.contentEquals(new StringBuilder(word).reverse()))
                .forEach(System.out::println);

//        15. Wyświetl wszystkie słowa z podanej listy, oddziel je przecinkami, zadbaj o to, żeby zamienić wszystkie
//        litery na duże

        System.out.println();
        System.out.println("\t\t\tZadanie 15");
        System.out.println();

        String joinedInStream = words.stream()
                .map(word -> word.toUpperCase())
                .collect(Collectors.joining(", "));

        String joined = String.join(", ", words);
        joined = joined.toUpperCase();

        System.out.println(joinedInStream);
        System.out.println(joined);

//        16. Mając dwie listy liczb całkowitych znajdź najmniejszą liczbę parzystą

        System.out.println();
        System.out.println("\t\t\tZadanie 16");
        System.out.println();

        List<Integer> list1 = List.of(62, 65, 12, 125, 76, 343, 21, 245, 234, 111, 980, 234);
        List<Integer> list2 = List.of(34, 23, 654, 23, 11, 4);

        Stream<Integer> concatedLists = Stream.concat(list1.stream(), list2.stream());

        Integer i = concatedLists.filter(number -> number % 2 == 0)
                .sorted()
                .findFirst()
                .get();

        System.out.println(i);

//                users.stream()
//                .filter(user -> user.name().equals("Julia"))
//                .map(user -> user.name() + ", potrafi: " + String.join(", ", user.skills()) + ". Ma " + user.age() + " lat.")
//                .forEach(System.out::println);


    }


    private static List<User> prepareData() {
        List<User> users = new ArrayList<>();

        users.add(new User("Janusz", 34, List.of("Java", "C++", "TurboPascal"), true));
        users.add(new User("Klaudia", 28, List.of("Anglieski", "C++", "Cookidoo"), true));
        users.add(new User("Julia", 7, List.of("Polski", "Netflix", "Youtube"), true));
        users.add(new User("Kuba", 6, List.of("Polski", "Netflix", "Youtube", "Cookidoo"), true));
        users.add(new User("Mariusz", 45, List.of("Java", "JS", "Python", "C#"), true));
        users.add(new User("Kamil", 35, List.of("Java", "JS", "Python", "C#", "C++"), true));
        users.add(new User("Krystyna", 55, List.of("JS", "Python", "C#", "C++"), false));
        users.add(new User("Jadwiga", 28, List.of("JS", "PHP", "Basic", "Cookidoo"), false));


        return users;
    }
}
