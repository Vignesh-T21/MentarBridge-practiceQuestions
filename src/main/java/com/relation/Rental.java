package com.relation;

/**
 * Represents a rental transaction in the Vehicle Rental Management System.
 *
 * <p>A Rental connects a {@link Customer} with a {@link Vehicle}.
 * Therefore, Rental has a HAS-A relationship with both Customer and Vehicle.</p>
 *
 * <p>The class stores the rental ID and the number of days for which
 * the vehicle is rented.</p>
 *
 * @author vignesh
 */
public class Rental {

    private String rentalId;
    private int rentalDays;

    /**
     * The customer associated with this rental.
     *
     * <p>This represents a HAS-A relationship because a Rental
     * has a Customer.</p>
     */
    private Customer customer;

    /**
     * The vehicle associated with this rental.
     *
     * <p>This represents a HAS-A relationship because a Rental
     * has a Vehicle.</p>
     */
    private Vehicle vehicle;

    /**
     * Creates a new Rental object.
     *
     * @param rentalId the unique ID of the rental
     * @param rentalDays the number of days the vehicle is rented
     * @param customer the customer who rents the vehicle
     * @param vehicle the vehicle being rented
     */
    public Rental(String rentalId, int rentalDays, Customer customer, Vehicle vehicle) {

        this.rentalId = rentalId;
        this.rentalDays = rentalDays;
        this.customer = customer;
        this.vehicle = vehicle;
    }

    /**
     * Calculates the total rental cost.
     *
     * <p>The total cost is calculated by multiplying the number
     * of rental days by the vehicle's daily rental cost.</p>
     *
     * @return the total rental cost
     */
    public double calculateTotalCost() {
        return rentalDays * vehicle.getRentPerDay();
    }

    /**
     * Displays the complete rental details.
     *
     * <p>This method displays the customer details, vehicle details,
     * number of rental days, and the total rental amount.</p>
     */
    public void displayRentalDetails() {
        customer.displayCustomerDetails();
        System.out.println();

        vehicle.displayVehicleDetails();
        System.out.println("Rental Days : " + rentalDays);
        System.out.println("Total Amount : €" + calculateTotalCost());
    }
}