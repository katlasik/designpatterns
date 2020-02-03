package pl.workshop.builder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeReader {

    private final String path;

    public EmployeeReader(String path) {
        this.path = path;
    }

    Stream<String> readLines() throws IOException {
        return Files.lines(Paths.get(path));
    }

    private Employee parse(String line) {

        var tokens = line.split(",");

        return TypeSafeEmployeeBuilder.builder()
                .firstName(tokens[0])
                .lastName(tokens[1])
                .department(tokens[2])
                .position(Positition.valueOf(tokens[3]))
                .salary(Integer.parseInt(tokens[4]))
                .availableHolidays(Integer.parseInt(tokens[5]))
                .birthDate(LocalDate.parse(tokens[6]))
                .employedSince(LocalDate.parse(tokens[7]))
                .active(Boolean.parseBoolean(tokens[8]))
                .external(Boolean.parseBoolean(tokens[9]));

    }

    public List<Employee> read() throws IOException {
        return readLines().map(this::parse).collect(Collectors.toList());
    }
}
