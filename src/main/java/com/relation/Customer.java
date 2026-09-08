package com.relation;

public class Customer {

    private String customerId;
    private String customerName;
    private String phoneNumber;

    // HAS-A relationship
    private Address address;

    public Customer(String customerId, String customerName, String phoneNumber, Address address) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;

        // Address object is connected to Customer here
        this.address = address;
    }

    public void displayCustomerDetails() {

        System.out.println("Customer ID : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Phone Number : " + phoneNumber);

        address.displayAddress();
    }
}