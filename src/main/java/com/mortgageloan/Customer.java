package com.mortgageloan;

public class Customer {

    private final String name;
    private final int age;
    private final IncomeDetails incomeDetails;

    public Customer(String name, int age, IncomeDetails incomeDetails) {
        this.name = name;
        this.age = age;
        this.incomeDetails = incomeDetails;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public IncomeDetails getIncomeDetails() {
        return incomeDetails;
    }

    public void displayDetails() {
        System.out.println("Customer Name  : " + name);
        System.out.println("Age            : " + age);
        incomeDetails.displayIncome();
    }
}