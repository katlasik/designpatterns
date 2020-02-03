package pl.workshop.composite.filesystem;

import java.util.Iterator;

public interface FileSystemEntry {

    int size();

    String getName();

    boolean isDirectory();

    Iterator<FileSystemEntry> iterator();

    static FileSystemEntry directory(String name, FileSystemEntry... children) {
        throw new UnsupportedOperationException("Zaimplementuj!");
    }

    static FileSystemEntry file(String name, int size) {
        throw new UnsupportedOperationException("Zaimplementuj!");
    }
}
