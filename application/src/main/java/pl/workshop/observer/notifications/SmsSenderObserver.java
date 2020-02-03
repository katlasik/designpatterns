package pl.workshop.observer.notifications;


public class SmsSenderObserver {

    void sendSms(double waterLevel) {
        System.out.printf("Sending warning sms: water level is %.2f.%n", waterLevel);
    }

}
