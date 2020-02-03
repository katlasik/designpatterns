package pl.workshop.utils;

import java.util.concurrent.ThreadLocalRandom;

public class Sleeper {

    private final static ThreadLocalRandom random = ThreadLocalRandom.current();

    public static void sleep() {
        try {
            Thread.sleep(random.nextInt(1000) + 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private Sleeper() {}
}
