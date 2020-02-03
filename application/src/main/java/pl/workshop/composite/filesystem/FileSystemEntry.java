package pl.workshop.composite.filesystem;

import java.util.Iterator;

public interface FileSystemEntry {

    int size();

    String getName();

    boolean isDirectory();

    Iterator<FileSystemEntry> iterator();

}
