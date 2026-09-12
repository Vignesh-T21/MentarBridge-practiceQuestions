package com.mortgageloan;

public class IncomeDetails {

    private final String job;
    private final double monthlyIncome;

    public IncomeDetails(String job, double monthlyIncome) {
        this.job = job;
        this.monthlyIncome = monthlyIncome;
    }

    public String getJob() {
        return job;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void displayIncome() {
        System.out.println("Job            : " + job);
        System.out.println("Monthly Income : Rs." + monthlyIncome);
    }
}
