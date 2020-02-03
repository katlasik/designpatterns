package pl.workshop.builder;

import java.time.LocalDate;

interface SetFirstName {
    SetLastName firstName(String firstName);
}

interface SetLastName {
    SetDepartment lastName(String lastName);
}

interface SetDepartment {
    SetPosition department(String department);
}

interface SetPosition {
    SetSalary position(Positition position);
}

interface SetSalary {
    SetAvailableHolidays salary(int salary);
}

interface SetAvailableHolidays {
    SetBirthDate availableHolidays(int availableHolidays);
}

interface SetBirthDate {
    SetEmployedSince birthDate(LocalDate birthDate);
}

interface SetEmployedSince {
    SetIsActive employedSince(LocalDate employedSince);
}

interface SetIsActive {
    SetIsExternal active(boolean active);
}

interface SetIsExternal {
    Employee external(boolean external);
}

public class TypeSafeEmployeeBuilder implements SetFirstName,
        SetLastName,
        SetDepartment,
        SetPosition,
        SetSalary,
        SetAvailableHolidays,
        SetBirthDate,
        SetEmployedSince,
        SetIsActive,
        SetIsExternal {
    private String firstName;
    private String lastName;
    private String department;
    private Positition position;
    private int salary;
    private int availableHolidays;
    private LocalDate birthDate;
    private LocalDate employedSince;
    private boolean active;

    private TypeSafeEmployeeBuilder() {
    }

    static SetFirstName builder() {
        return new TypeSafeEmployeeBuilder();
    }

    @Override
    public SetLastName firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public SetDepartment lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public SetPosition department(String department) {
        this.department = department;
        return this;
    }

    @Override
    public SetSalary position(Positition position) {
        this.position = position;
        return this;
    }

    @Override
    public SetAvailableHolidays salary(int salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public SetBirthDate availableHolidays(int availableHolidays) {
        this.availableHolidays = availableHolidays;
        return this;
    }

    @Override
    public SetEmployedSince birthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    @Override
    public SetIsActive employedSince(LocalDate employedSince) {
        this.employedSince = employedSince;
        return this;
    }

    @Override
    public SetIsExternal active(boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public Employee external(boolean external) {
        return new Employee(firstName, lastName, department, position, salary, availableHolidays, birthDate, employedSince, active, external);
    }

}
