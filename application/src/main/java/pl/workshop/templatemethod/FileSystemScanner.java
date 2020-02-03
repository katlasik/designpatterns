package pl.workshop.templatemethod;

import pl.workshop.templatemethod.loader.FileLoader;

import java.util.List;

public abstract class FileSystemScanner implements CallbackFileScanner {

    private FileLoader fileLoader = new FileLoader();

    @Override
    public List<String> findAll() {
        throw new UnsupportedOperationException("Zaimplementuj!");
    }

}
