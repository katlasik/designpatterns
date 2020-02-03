package pl.workshop.composite.iterators;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SingleElementIterator<T> implements Iterator<T> {

    private boolean visited = false;
    private final T element;

    public SingleElementIterator(T element) {
        this.element = element;
    }

    @Override
    public boolean hasNext() {
        return !visited;
    }

    @Override
    public T next() {
        if(visited) {
            throw new NoSuchElementException();
        } else {
            visited = true;
            return element;
        }
    }
}
