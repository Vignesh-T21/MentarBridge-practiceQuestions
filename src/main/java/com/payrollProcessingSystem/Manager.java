package com.payrollProcessingSystem;

public class Manager extends PermanentEmployee {

    private final double performanceBonus;

    public Manager(String employeeName, String employeeId, double basicSalary, double houseAllowance, double transportAllowance,
            double performanceBonus) {

        super(employeeName, employeeId, basicSalary, houseAllowance, transportAllowance);
        this.performanceBonus = performanceBonus;
    }

    public double getPerformanceBonus() {
        return performanceBonus;
    }

    @Override
    public double calculateGrossSalary() {
        return getBasicSalary() + getHouseAllowance() + getTransportAllowance() + performanceBonus;
    }

    @Override
    public double calculateDeduction() {
        return calculateGrossSalary() * 0.12;
    }
}


