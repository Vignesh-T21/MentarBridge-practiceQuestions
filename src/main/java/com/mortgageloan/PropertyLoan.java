package com.mortgageloan;

public class PropertyLoan extends Loan implements Verifiable {

    private final double landValue;
    public PropertyLoan(double loanAmount, int tenure, double landValue) {
        super(loanAmount, tenure);
        this.landValue = landValue;
    }

    @Override
    public void calculateLoan() {

        System.out.println("Property loan calculation completed.");
        System.out.println("Land Value     : Rs." + landValue);
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
