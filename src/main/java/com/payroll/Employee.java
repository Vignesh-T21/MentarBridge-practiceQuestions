package com.payroll;

abstract class Employee {

    private int employeeId;
    private String employeeName;
    private double Salary;

    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.Salary = basicSalary;
    }


    public int getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public double getSalary() {
        return Salary;
    }

    abstract double calculateSalary();
    abstract String getRole();
    abstract double getAllowance();
}
