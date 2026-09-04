package com.payroll;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee employee1 = new Developer(1, "Vignesh", 50000);
        Employee employee2 = new SeniorDeveloper(2, "yuvaraj", 70000);
        Employee employee3 = new TeamLead(3, "Eswar", 100000);



        System.out.println("=================================================================");
        System.out.println("                EMPLOYEE PAYROLL MANAGEMENT");
        System.out.println("=================================================================");
        displayEmployee(employee1);
        displayEmployee(employee2);
        displayEmployee(employee3);
        System.out.println("=================================================================");
    }

    static void displayEmployee(Employee employee) {
        System.out.println("\nEmployee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Role: " + employee.getRole());
        System.out.println("Basic Salary: " + employee.getSalary());
        System.out.println("Allowance: " + employee.getAllowance());
        System.out.println("Total Salary: " + employee.calculateSalary());
    }
}