package com.finalkeyword;

public class Demo {
    public static void main(String[] args) {
        final Company company = new Company();

        company.showCompany();
        company.showEmployee("Yuvaraja");
        System.out.println("------------------\n");

        Manager manager = new Manager();
        manager.showManager();
    }
}