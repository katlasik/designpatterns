package pl.workshop.builder;

import java.time.LocalDate;

public class EmployeeBuilder {
        private String firstName;
        private String lastName;
        private String department;
        private Positition position;
        private int salary;
        private int availableHolidays;
        private LocalDate birthDate;
        private LocalDate employedSince;
        private boolean isActive;
        private boolean isExternal;

        private EmployeeBuilder() {}

        public static EmployeeBuilder builder() {
            return new EmployeeBuilder();
        }

        public EmployeeBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EmployeeBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public EmployeeBuilder department(String department) {
            this.department = department;
            return this;
        }

        public EmployeeBuilder position(Positition position) {
            this.position = position;
            return this;
        }

        public EmployeeBuilder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public EmployeeBuilder availableHolidays(int availableHolidays) {
            this.availableHolidays = availableHolidays;
            return this;
        }

        public EmployeeBuilder birthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public EmployeeBuilder employedSince(LocalDate employedSince) {
            this.employedSince = employedSince;
            return this;
        }

        public EmployeeBuilder isActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public EmployeeBuilder isExternal(boolean isExternal) {
            this.isExternal = isExternal;
            return this;
        }

        public Employee build() {
            return new Employee(firstName, lastName, department, position, salary, availableHolidays, birthDate, employedSince, isActive, isExternal);
        }
    }
