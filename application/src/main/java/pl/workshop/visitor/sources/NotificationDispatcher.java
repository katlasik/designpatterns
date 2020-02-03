package pl.workshop.visitor.sources;

import com.github.javafaker.*;
import pl.workshop.visitor.sources.NotificationHandler;
import pl.workshop.visitor.notifications.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static pl.workshop.utils.Sleeper.sleep;

public class NotificationDispatcher {

    private final ThreadLocalRandom random = ThreadLocalRandom.current();
    private static final Faker FAKER = new Faker();
    private final List<NotificationHandler> handlers;

    public NotificationDispatcher(NotificationHandler... handlers) {
        this.handlers = Arrays.asList(handlers);
    }

    public void start() {
        while (true) {

            switch (random.nextInt(4)) {
                case 0:
                    onNotification(new UserConfirmed(FAKER.twinPeaks().character(), FAKER.internet().emailAddress()));
                    break;
                case 1:
                    onNotification(new UserCreated(FAKER.twinPeaks().character(), FAKER.internet().emailAddress())); break;
                case 2:
                    onNotification(
                            new UserLoggedIn(
                                    FAKER.twinPeaks().character(),
                                    LocalDateTime.now().minusMinutes(random.nextInt(100))
                            )
                    );
                    break;
                case 3:
                    onNotification(new BulkUserLoggedInNotification(
                                    IntStream.range(0, random.nextInt(10))
                                            .mapToObj(i ->
                                                    new UserLoggedIn(
                                                            FAKER.twinPeaks().character(),
                                                            LocalDateTime.now().minusMinutes(random.nextInt(100))
                                                    )
                                            )
                                            .collect(Collectors.toList())
                            )
                    );
                    break;
            }

            sleep();
        }
    }


    public void onNotification(Notification notification) {
        handlers.forEach(handler -> handler.registerNotification(notification));
    }


}
