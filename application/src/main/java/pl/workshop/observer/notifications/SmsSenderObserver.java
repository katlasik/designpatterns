package pl.workshop.observer.notifications;

import pl.workshop.observer.Observer;

public class SmsSenderObserver implements Observer<Double> {

    void sendSms(double waterLevel) {
        System.out.printf("Sending warning sms: water level is %.2f.%n", waterLevel);
    }

    @Override
    public void receiveNotification(Double value) {
        sendSms(value);
    }
}
