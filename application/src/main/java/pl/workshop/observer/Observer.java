package pl.workshop.observer;

public interface Observer<T> {

    void sendNotification(T value);

}
