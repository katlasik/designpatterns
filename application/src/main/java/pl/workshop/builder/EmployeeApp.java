package pl.workshop.builder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
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
