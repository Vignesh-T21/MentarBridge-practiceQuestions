package com.payrollProcessingSystem;

import java.util.List;

public class PayrollReport {
    public void generateReport(List<Employee> employees) {
        System.out.println("\n========== PAYROLL REPORT ==========");
        for (Employee employee : employees) {

            employee.displayEmployeeDetails();
            System.out.println("Gross Salary : " + employee.calculateGrossSalary());
            System.out.println("Deduction    : " + employee.calculateDeduction());
            System.out.println("Net Salary   : " + employee.calculateNetSalary());
            System.out.println("------------------------------------");
        }

        System.out.println("====================================");
    }
}
