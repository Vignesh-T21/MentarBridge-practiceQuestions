package com.finalkeyword;

class Company {
    final String companyName = "TCS";

    Company() {
        System.out.println("Company Constructor");
    }

    final void showCompany() {
        System.out.println("Company Name: " + companyName);
    }
    void showEmployee(final String name) {
        System.out.println("Employee Name: " + name);
    }
}
