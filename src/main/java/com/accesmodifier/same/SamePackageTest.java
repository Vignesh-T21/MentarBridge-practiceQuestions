package com.accesmodifier.same;



public class SamePackageTest {
    public static void main(String[] args) {
        Company company = new Company();
        System.out.println("Same Package:");


        System.out.println(company.defaultData);
        System.out.println(company.protectedData);
        System.out.println(company.publicData);
    }
}