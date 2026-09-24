package com.payrollProcessingSystem;

public abstract class Employee {

    private final String employeeName;
    private final String employeeId;
    private final double basicSalary;

    public Employee(String employeeName, String employeeId, double basicSalary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee Id : " + employeeId);
        System.out.println("Employee Basic Salary : " + basicSalary);
    }

    public abstract double calculateGrossSalary();

    public abstract double calculateDeduction();

    public double calculateNetSalary() {
        return calculateGrossSalary() - calculateDeduction();
    }
}

