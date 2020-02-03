package pl.workshop.templatemethod;

import pl.workshop.templatemethod.loader.FileLoader;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class LambdaFileSystemScanner implements FileScanner {

    private FileLoader fileLoader = new FileLoader();

    private final Consumer<String> fileFoundCallback;
    private IntConsumer onCompleteCallback;

    public LambdaFileSystemScanner(Consumer<String> fileFoundCallback, IntConsumer onCompleteCallback) {
        this.fileFoundCallback = fileFoundCallback;
        this.onCompleteCallback = onCompleteCallback;
    }

    @Override
    public List<String> findAll() {

        var nextFileExists = true;
        var count = 0;
        List<String> fileNames = new ArrayList<>();

        while (nextFileExists) {
            var file = fileLoader.nextFile();

            if (file.isPresent()) {
                fileFoundCallback.accept(file.get());
                fileNames.add(file.get());
            } else {
                onCompleteCallback.accept(count);
                nextFileExists = false;
            }
        }

        return fileNames;
    }

}
