package com.payrollProcessingSystem;

public class ContractEmployee extends Employee {

    private final double contractBonus;

    public ContractEmployee(String employeeName, String employeeId, double basicSalary, double contractBonus) {
        super(employeeName, employeeId, basicSalary);
        this.contractBonus = contractBonus;
    }

    public double getContractBonus() {
        return contractBonus;
    }

    @Override
    public double calculateGrossSalary() {
        return getBasicSalary() + contractBonus;
    }

    @Override
    public double calculateDeduction() {
        return calculateGrossSalary() * 0.05;
    }
}


