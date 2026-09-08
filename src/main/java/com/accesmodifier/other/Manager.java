package com.accesmodifier.other;


import com.accesmodifier.same.Company;

public class Manager extends Company {
    public void showData() {
        System.out.println(protectedData);
        System.out.println(publicData);

    }
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.showData();
    }
}
