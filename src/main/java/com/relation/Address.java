package com.relation;

/**
 * Represents the address of a customer in the Vehicle Rental Management System.
 *
 * <p>An Address object contains the house number, street, city,
 * and postal code of a customer.</p>
 *
 * <p>The {@link Customer} class has an Address, which represents
 * a HAS-A relationship.</p>
 *
 * @author vignesh
 */
public class Address {

    private String houseNumber;
    private String street;
    private String city;
    private String postalCode;

    /**
     * Creates a new Address object.
     *
     * @param houseNumber the house number of the customer
     * @param street the street name of the customer
     * @param city the city where the customer lives
     * @param postalCode the postal code of the customer's address
     */
    public Address(String houseNumber, String street,
                   String city, String postalCode) {

        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    /**
     * Displays the complete address details.
     *
     * <p>This method displays the house number, street, city,
     * and postal code.</p>
     */
    public void displayAddress() {

        System.out.println("House Number : " + houseNumber);
        System.out.println("Street : " + street);
        System.out.println("City : " + city);
        System.out.println("Postal Code : " + postalCode);
    }
}