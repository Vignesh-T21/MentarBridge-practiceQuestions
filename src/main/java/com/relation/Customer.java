package com.relation;


/**
 * Represents a customer in the Vehicle Rental Management System.
 *
 * <p>A Customer contains personal details such as customer ID,
 * name, and phone number.</p>
 *
 * <p>A Customer also has an {@link Address}, which represents
 * a HAS-A relationship between Customer and Address.</p>
 *
 * @author vignesh
 */
public class Customer {

    private String customerId;
    private String customerName;
    private String phoneNumber;

    /**
     * Address associated with this customer.
     *
     * <p>This represents a HAS-A relationship because a Customer
     * has an Address.</p>
     */
    private Address address;

    /**
     * Creates a new Customer object.
     *
     * @param customerId the unique ID of the customer
     * @param customerName the name of the customer
     * @param phoneNumber the phone number of the customer
     * @param address the address associated with the customer
     */
    public Customer(String customerId, String customerName, String phoneNumber, Address address) {

        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;

        // Address object is connected to Customer here
        this.address = address;
    }

    /**
     * Displays the customer's personal and address details.
     *
     * <p>This method displays the customer ID, customer name,
     * phone number, and address details.</p>
     */
    public void displayCustomerDetails() {

        System.out.println("Customer ID : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Phone Number : " + phoneNumber);

        address.displayAddress();
    }
}