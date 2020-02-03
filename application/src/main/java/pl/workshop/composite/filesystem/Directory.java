package pl.workshop.composite.filesystem;

import pl.workshop.composite.iterators.DirectoryIterator;
import pl.workshop.composite.iterators.SingleElementIterator;

import java.util.*;

public class Directory implements FileSystemEntry {

    private final List<FileSystemEntry> entries;
    private final String name;


    public Directory(String name, List<FileSystemEntry> entries) {
        this.name = name;
        this.entries = Collections.unmodifiableList(entries);
    }

    @Override
    public int size() {
        return entries.stream().mapToInt(FileSystemEntry::size).sum();
    }

    public List<FileSystemEntry> getEntries() {
        return entries;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isDirectory() {
        return true;
    }

    @Override
    public Iterator<FileSystemEntry> iterator() {

        var children = new LinkedList<>(entries);

        if (children.isEmpty()) {
            return new SingleElementIterator<>(this);
        } else {
            return new DirectoryIterator(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(entries, directory.entries) &&
                Objects.equals(name, directory.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entries, name);
    }

    @Override
    public String toString() {
        return "Directory{name='" + name + "'}";
    }
}
