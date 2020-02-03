package pl.workshop.composite.filesystem;


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
        throw new UnsupportedOperationException("Zaimplementuj!");
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
        throw new UnsupportedOperationException("Zaimplementuj!");
    }

    @Override
    public Iterator<FileSystemEntry> iterator() {
        throw new UnsupportedOperationException("Zaimplementuj!");
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
