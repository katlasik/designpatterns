package pl.workshop.observer;

import java.util.ArrayList;
import java.util.List;

public class WaterLevelObservable implements Observable<Double> {

    private final List<Observer<Double>> observers = new ArrayList<>();
    private static final Double THRESHOLD =  180.0;

    @Override
    public void addObserver(Observer<Double> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<Double> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Double waterLevel) {

        if(waterLevel > THRESHOLD) {
            for (Observer<Double> observer : observers) {
                observer.receiveNotification(waterLevel);
            }
        }
    }
}
