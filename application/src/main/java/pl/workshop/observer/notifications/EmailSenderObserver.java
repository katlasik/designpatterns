package pl.workshop.observer.notifications;

import pl.workshop.observer.Observable;
import pl.workshop.observer.Observer;

public class EmailSenderObserver {

    void sendEmail(double waterLevel) {
        System.out.printf("Sending warning email: water level is %.2f.%n", waterLevel);
    }

}
