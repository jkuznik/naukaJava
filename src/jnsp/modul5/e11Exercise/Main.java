package jnsp.modul5.e11Exercise;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Integer> randomNumber = new ArrayList<>();

        Random random = new Random();

        Instant now = Instant.now();

        long startTime = System.currentTimeMillis();

        for(int i=0; i < 100_000_000; i++){
            randomNumber.add(random.nextInt(100_000_000));
        }

        Instant now2 = Instant.now();
        Duration duration = Duration.between(now, now2);

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println(elapsedTime);
        System.out.println(duration.toMillis());
    }
}
