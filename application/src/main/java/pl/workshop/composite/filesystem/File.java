package pl.workshop.composite.filesystem;

import pl.workshop.composite.iterators.SingleElementIterator;

import java.util.Iterator;
import java.util.Objects;

public class File implements FileSystemEntry {

    private final String name;
    private final int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public Iterator<FileSystemEntry> iterator() {
        return new SingleElementIterator(this);
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return size == file.size &&
                Objects.equals(name, file.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }
}
