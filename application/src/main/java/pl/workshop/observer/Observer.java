package pl.workshop.observer;

public interface Observer<T> {
    void receiveNotification(T value);
}
