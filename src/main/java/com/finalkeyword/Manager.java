package com.finalkeyword;

class Manager extends Company {
    String companyName = "Manager TCS";
    String managerName = "Vignesh";

    Manager(){
        super();
        System.out.println("Manager Constructor");
    }

    void showManager() {
        System.out.println("Manager Name: " + managerName);
        System.out.println("Manager Company: " + companyName);
        System.out.println("Parent Company: " + super.companyName);

        super.showEmployee("Eswar");
    }
}