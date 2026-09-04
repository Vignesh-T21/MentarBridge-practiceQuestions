package com.payroll;

class TeamLead extends SeniorDeveloper {

    TeamLead(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double getAllowance() {
        return 20000;
    }
    @Override
    double calculateSalary() {
        return getSalary() + getAllowance();
    }
    @Override
    String getRole() {
        return "Team Lead";
    }
}


