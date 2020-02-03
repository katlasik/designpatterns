package pl.workshop.composite.filesystem;

import java.util.Arrays;
import java.util.Iterator;

public interface FileSystemEntry {

    int size();

    String getName();

    boolean isDirectory();

    Iterator<FileSystemEntry> iterator();

    static FileSystemEntry directory(String name, FileSystemEntry... children) {
        return new Directory(name, Arrays.asList(children));
    }

    static FileSystemEntry file(String name, int size) {
        return new File(name, size);
    }
}
