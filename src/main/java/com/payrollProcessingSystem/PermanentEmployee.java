
package com.payrollProcessingSystem;

public class PermanentEmployee extends Employee {

    private final double houseAllowance;
    private final double transportAllowance;

    public PermanentEmployee(String employeeName, String employeeId, double basicSalary, double houseAllowance, double transportAllowance) {
        super(employeeName, employeeId, basicSalary);

        this.houseAllowance = houseAllowance;
        this.transportAllowance = transportAllowance;
    }

    public double getHouseAllowance() {
        return houseAllowance;
    }
    public double getTransportAllowance() {
        return transportAllowance;
    }

    @Override
    public double calculateGrossSalary() {
        return getBasicSalary() + houseAllowance + transportAllowance;
    }

    @Override
    public double calculateDeduction() {
        return calculateGrossSalary() * 0.10;
    }
}

