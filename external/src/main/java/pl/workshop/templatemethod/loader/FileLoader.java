package pl.workshop.templatemethod.loader;

import com.github.javafaker.Faker;

import java.util.Optional;

import static pl.workshop.utils.Sleeper.sleep;

public class FileLoader {

    private static final Faker FAKER = new Faker();
    private int n = 20;


    /**
     * Returns optional containing file or empty optional if all no more files are available.
     * @return loaded file
     */
    public Optional<String> nextFile() {
        sleep();
        if(n-- > 0) {
            return Optional.ofNullable(FAKER.file().fileName());
        } else {
            return Optional.empty();
        }
    }

}
