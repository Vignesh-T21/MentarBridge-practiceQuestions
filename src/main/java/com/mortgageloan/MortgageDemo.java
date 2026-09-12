package com.mortgageloan;

public class MortgageDemo {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("       MORTGAGE LOAN SYSTEM");
        System.out.println("======================================");

        // Income details
        IncomeDetails income = new IncomeDetails("Software Engineer", 90000);

        // Customer
        Customer customer = new Customer("Vignesh", 21, income);

        System.out.println("\n--- CUSTOMER DETAILS ---");
        customer.displayDetails();

        // Create Home Loan
        Loan loan = new HomeLoan(2500000, 20, 3500000);

        System.out.println("\n--- LOAN DETAILS ---");

        // Runtime polymorphism
        loan.calculateLoan();

        // EMI
        double emi = loan.calculateEMI();

        System.out.printf("Monthly EMI    : Rs.%.2f%n", emi);

        // Method overloading
        double specialEmi = loan.calculateEMI(8.5);

        System.out.printf("EMI at 8.5%%    : Rs.%.2f%n", specialEmi);

        // Static method
        System.out.println("Standard Interest Rate : " + Loan.calculateInterestRate() + "%");

        // Interface reference
        Verifiable verification = (Verifiable) loan;

        System.out.println("\n--- VERIFICATION ---");

        verification.verifyIncome();
        verification.checkCreditScore();
        verification.verificationMessage();

        System.out.println("\n--- LOAN STATUS ---");

        if (customer.getIncomeDetails().getMonthlyIncome() >= 50000) {
            System.out.println("Loan Status    : APPROVED");
        } else {
            System.out.println("Loan Status    : REJECTED");
        }

        System.out.println("\n======================================");
        System.out.println("     MORTGAGE PROCESS COMPLETED");
        System.out.println("======================================");
    }
}
