package com.mortgageloan;

public abstract class Loan {

    private final double loanAmount;
    private final int tenure;

    public Loan(double loanAmount, int tenure) {
        this.loanAmount = loanAmount;
        this.tenure = tenure;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public int getTenure() {
        return tenure;
    }


    public abstract void calculateLoan();
    public double calculateEMI() {

        double monthlyRate = 0.008;
        int months = tenure * 12;

        return (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
    }


    public double calculateEMI(double interestRate) {

        double monthlyRate = interestRate / 12 / 100;
        int months = tenure * 12;

        return (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);
    }


    public static double calculateInterestRate() {
        return 9.0;
    }
}
