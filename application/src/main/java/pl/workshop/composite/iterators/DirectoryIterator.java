package pl.workshop.composite.iterators;

import pl.workshop.composite.filesystem.Directory;
import pl.workshop.composite.filesystem.FileSystemEntry;

import java.util.Iterator;
import java.util.LinkedList;

public class DirectoryIterator implements Iterator<FileSystemEntry> {


    private final LinkedList<FileSystemEntry> children;
    private Iterator<FileSystemEntry> current;

    public DirectoryIterator(Directory directory) {
        this.children = new LinkedList<>(directory.getEntries());
        this.current = new SingleElementIterator<>(directory);
    }

    @Override
    public boolean hasNext() {
        if (current.hasNext()) {
            return true;
        } else {
            while (!children.isEmpty()) { //przesuwamy na pierwszy nie-pusty iterator dziecka
                current = children.pollFirst().iterator(); //pobieramy pierwsze dziecko z listy i tworzymy jego iterator
                if (current.hasNext()) {
                    return true;
                }
            }
            return false; //jeżeli już nie ma elementów dziecka
        }
    }

    @Override
    public FileSystemEntry next() {
        return current.next();
    }


}
