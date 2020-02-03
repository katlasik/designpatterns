package pl.workshop.observer;

import pl.workshop.observer.notifications.EmailSenderObserver;
import pl.workshop.observer.notifications.SmsSenderObserver;
import pl.workshop.observer.sensors.WaterLevelSensor;

/**
 * Stwórz klasę WaterLevelObservable implementującą interfejs Observable.
 * Stwórzy instancję WaterLevelSensor, przekazując jako argument funkcję wywołującą metodę notifyObservers w WaterLevelObservable.
 *
 * Dokończ implementację EmailSenderObserver i SmsSenderObserver oraz dodaj obydwa obserwatory do WaterLevelObservable.
 * Klasa WaterLevelObservable powinna informować swoich obserwatorów tylko jeżeli poziom wody będzie wynosił powyżej 180 cm.
 *
 */
public class WaterLevelApp {

    public static void main(String[] args) throws InterruptedException {

        var observable = new WaterLevelObservable();

        new WaterLevelSensor(observable::notifyObservers).start();

        var emailSenderObserver = new EmailSenderObserver();
        var smsSenderObserver = new SmsSenderObserver();

        observable.addObserver(emailSenderObserver);
        observable.addObserver(smsSenderObserver);


    }

}
