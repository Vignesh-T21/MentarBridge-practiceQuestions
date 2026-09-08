package com.payroll;


class Developer extends Employee {

    Developer(int id, String name, double salary) {
        super(id, name, salary);
    }
    



    @Override
    double getAllowance() {
        return 10000;
    }
    @Override
    double calculateSalary() {
        return getSalary() + getAllowance();
    }
    @Override
    String getRole() {
        return "Developer";
    }
}
