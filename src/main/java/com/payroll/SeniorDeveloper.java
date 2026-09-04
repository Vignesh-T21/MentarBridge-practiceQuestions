package com.payroll;

class SeniorDeveloper extends Developer {
    SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }


    @Override
    double getAllowance() {
        return 15000;
    }
    @Override
    double calculateSalary() {
        return getSalary() + getAllowance();
    }
    @Override
    String getRole() {
        return "Senior Developer";
    }
}


