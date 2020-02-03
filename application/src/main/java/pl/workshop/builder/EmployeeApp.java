package pl.workshop.builder;

import java.io.IOException;
import java.util.List;

/**
 * Stwórz klasę builder dla Employee.
 * Przerób metodę parse w EmployeeReader w ten sposób, aby korzystała z wzorca builder.
 *
 * (Opcjonalnie) Stwórz type-safe builder dla Employee.
 */
public class EmployeeApp {


    public static void main(String[] args) throws IOException {

        List<Employee> employees = new EmployeeReader("src/main/resources/csv/employees.csv").read();

        System.out.println("Pracownicy firmy:");
        for (Employee employee : employees) {
            if(employee.isActive()) {
                System.out.println(employee.getFirstName() + " " + employee.getLastName());
            }
        }


    }

}
