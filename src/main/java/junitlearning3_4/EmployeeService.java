package junitlearning3_4;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {
    private final List<Employee> employees;

    public EmployeeService(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployeesByDepartment(String dept) {
        return employees.stream()
                .filter(e -> e.getDepartment().equals(dept))  // Bug: case-sensitive
                .collect(Collectors.toList());
    }

    public Optional<Employee> getHighestPaidEmployee() {
        return employees.stream()
                .max(Comparator.comparing(Employee::getSalary));
    }
}

