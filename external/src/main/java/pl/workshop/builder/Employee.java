package pl.workshop.builder;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private final String firstName;
    private final String lastName;
    private final String department;
    private final Positition position;
    private final int salary;
    private final int availableHolidays;
    private final LocalDate birthDate;
    private final LocalDate employedSince;
    private final boolean isActive;
    private final boolean isExternal;

    public Employee(String firstName, String lastName, String department, Positition position, int salary, int availableHolidays, LocalDate birthDate, LocalDate employedSince, boolean isActive, boolean isExternal) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.availableHolidays = availableHolidays;
        this.birthDate = birthDate;
        this.employedSince = employedSince;
        this.isActive = isActive;
        this.isExternal = isExternal;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public Positition getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public int getAvailableHolidays() {
        return availableHolidays;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getEmployedSince() {
        return employedSince;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isExternal() {
        return isExternal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                ", availableHolidays=" + availableHolidays +
                ", birthDate=" + birthDate +
                ", employedSince=" + employedSince +
                ", isActive=" + isActive +
                ", isExternal=" + isExternal +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                availableHolidays == employee.availableHolidays &&
                isActive == employee.isActive &&
                isExternal == employee.isExternal &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(department, employee.department) &&
                position == employee.position &&
                Objects.equals(birthDate, employee.birthDate) &&
                Objects.equals(employedSince, employee.employedSince);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, department, position, salary, availableHolidays, birthDate, employedSince, isActive, isExternal);
    }

}
