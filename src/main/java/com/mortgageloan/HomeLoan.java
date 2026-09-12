package com.mortgageloan;

public class HomeLoan extends Loan implements Verifiable {

    private final double propertyValue;

    public HomeLoan(double loanAmount, int tenure, double propertyValue) {
        super(loanAmount, tenure);
        this.propertyValue = propertyValue;
    }

    @Override
    public void calculateLoan() {

        System.out.println("Home loan calculation completed.");
        System.out.println("Property Value : Rs." + propertyValue);
        System.out.println("Loan Amount    : Rs." + getLoanAmount());
    }

    @Override
    public void verifyIncome() {
        System.out.println("Income verification successful.");
    }

    @Override
    public void checkCreditScore() {
        System.out.println("Credit score check successful.");
    }
}
