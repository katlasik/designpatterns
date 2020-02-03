package pl.workshop.observer;

public interface Observable<T> {

    void addObserver(Observer<T> observer);
    void removeObserver(Observer<T> observer);
    void notifyObservers(T waterLevel);

}
