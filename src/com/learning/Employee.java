package com.learning;

public class Employee {
    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empCity='" + empCity + '\'' +
                ", empCountry='" + empCountry + '\'' +
                ", empSalary=" + empSalary +
                ", empDepratmentName='" + empDepratmentName + '\'' +
                '}';
    }

    private final Integer empId;
    private final String empName;
    private final String empCity;
    private final String empCountry;

    public Long getEmpSalary() {
        return empSalary;
    }

    private final Long empSalary;
    private final String empDepratmentName;

    public Employee(Integer empId, String empName, String empCity, String empCountry, Long empSalary, String empDepratmentName) {
        this.empId = empId;
        this.empName = empName;
        this.empCity = empCity;
        this.empCountry = empCountry;
        this.empSalary = empSalary;
        this.empDepratmentName = empDepratmentName;
    }

    public String getEmpName() {
        return empName;
    }
}
