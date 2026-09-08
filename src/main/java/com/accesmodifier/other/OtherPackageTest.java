package com.accesmodifier.other;


import com.accesmodifier.same.Company;

public class OtherPackageTest {
    public static void main(String[] args) {
        Company company = new Company();

        System.out.println("Other Package:");
        System.out.println(company.publicData);

    }
}
