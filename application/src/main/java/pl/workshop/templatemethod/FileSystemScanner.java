package pl.workshop.templatemethod;

import pl.workshop.templatemethod.loader.FileLoader;

import java.util.ArrayList;
import java.util.List;

public abstract class FileSystemScanner implements CallbackFileScanner {

    private FileLoader fileLoader = new FileLoader();

    @Override
    public List<String> findAll() {

        var nextFileExists = true;
        var count = 0;
        List<String> fileNames = new ArrayList<>();

        while (nextFileExists) {
            var file = fileLoader.nextFile();

            if (file.isPresent()) {
                count++;
                onFoundFile(file.get());
                fileNames.add(file.get());
            } else {
                onComplete(count);
                nextFileExists = false;
            }
        }

        return fileNames;
    }

}
