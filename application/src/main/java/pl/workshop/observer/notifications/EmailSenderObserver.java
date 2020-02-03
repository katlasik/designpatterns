package pl.workshop.observer.notifications;

import pl.workshop.observer.Observer;

public class EmailSenderObserver implements Observer<Double> {

    void sendEmail(double waterLevel) {
        System.out.printf("Sending warning email: water level is %.2f.%n", waterLevel);
    }

    @Override
    public void receiveNotification(Double value) {
        sendEmail(value);
    }
}
