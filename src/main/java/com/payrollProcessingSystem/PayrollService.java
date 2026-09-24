package com.payrollProcessingSystem;

import java.util.ArrayList;
import java.util.List;

public class PayrollService {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        Employee permanentEmployee = new PermanentEmployee("Yuvaraja",
                "EMP101", 3000, 500, 200);

        Employee contractEmployee = new ContractEmployee("Eswar", "EMP102",
                3000, 400);

        Employee manager = new Manager("Vignesh", "EMP103", 5000, 800,
                        300, 1000);

        employees.add(permanentEmployee);
        employees.add(contractEmployee);
        employees.add(manager);
        for (Employee employee : employees) {
            Payroll employeePayroll = new Payroll(employee);
            employeePayroll.generatePayslip();
        }
//
//        PayrollReport payrollReport=new PayrollReport();
//        payrollReport.generateReport(employees);

    }
}

