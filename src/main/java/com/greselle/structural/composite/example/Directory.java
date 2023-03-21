package com.greselle.structural.composite.example;

import java.util.ArrayList;
import java.util.List;

// Composite
public class Directory implements Employee {

    private List<Employee> employees = new ArrayList<>();

    @Override
    public void showEmployeeDetails() {
        employees.forEach(Employee::showEmployeeDetails);
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}
