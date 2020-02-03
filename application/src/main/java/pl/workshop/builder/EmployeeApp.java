package pl.workshop.builder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Stwórz klasę builder dla Employee.
 * Przerób metodę parse w EmployeeApp w ten sposób, aby korzystała z wzorca builder.
 * <p>
 * (Opcjonalnie) Stwórz type-safe builder dla Employee.
 */
public class EmployeeApp {

    private static Employee parse(String line) {

        var tokens = line.split(",");

        return new Employee(
                tokens[0],
                tokens[1],
                tokens[2],
                Positition.valueOf(tokens[3]),
                Integer.parseInt(tokens[4]),
                Integer.parseInt(tokens[5]),
                LocalDate.parse(tokens[6]),
                LocalDate.parse(tokens[7]),
                Boolean.parseBoolean(tokens[8]),
                Boolean.parseBoolean(tokens[9])
        );

    }

    public static void main(String[] args) throws IOException {

        var employees = Files.readAllLines(Paths.get("application/src/main/resources/csv/employees.csv"))
                .stream()
                .map(EmployeeApp::parse)
                .collect(Collectors.toList());

        System.out.println("Pracownicy firmy:");
        for (Employee employee : employees) {
            if (employee.isActive()) {
                System.out.println(employee.getFirstName() + " " + employee.getLastName());
            }
        }


    }

}
