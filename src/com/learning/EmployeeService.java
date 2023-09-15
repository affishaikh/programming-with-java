package com.learning;

/*
Write a program to store employees record with following data points by using Java Collection Object
	EmpId
	EmpName
	EmpCity
	EmpCountry
	EmpSalary
	EmpDepratmentName

1. Sort the employees record by employee name
2. Filter the employee records based upon the name starting with A
3. Calculate the total salary of all the employees by using Java8 functional programming
4. Count the total number of employees belong to any specific city
 */

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    private final List<Employee> employees;

    public EmployeeService(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> filterNameStartingWith(String prefix) {
        return this.employees.stream()
                .filter(employee -> employee.getEmpName().startsWith(prefix))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Employee john = new Employee(1,
                "John",
                "Pune",
                "India",
                10000L,
                "CS");
        Employee helen = new Employee(1,
                "helen",
                "Pune",
                "India",
                10000L,
                "CS");
        Employee aragon = new Employee(1,
                "Aragon",
                "Pune",
                "India",
                10000L,
                "CS");
        List<Employee> employeeList = List.of(john, helen, aragon);
        EmployeeService employeeService = new EmployeeService(employeeList);

        List<Employee> a = employeeService.filterNameStartingWith("A");

        System.out.println(a);

        Long allSalary = employeeService.totalSalaryOfAllEmployees();

        System.out.println(allSalary);

//        List<Employee> allEmployees = employeeService.count();
    }

    private Long totalSalaryOfAllEmployees() {
        return this.employees.stream().reduce(0L, ((totalSalary, employee2) -> totalSalary + employee2.getEmpSalary()), Long::sum);
    }
}
