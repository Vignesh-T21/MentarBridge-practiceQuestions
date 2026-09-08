package com.relation;

public class Rental {

    private String rentalId;
    private int rentalDays;

    private Customer customer;
    private Vehicle vehicle;

    public Rental(String rentalId, int rentalDays, Customer customer, Vehicle vehicle) {

        this.rentalId = rentalId;
        this.rentalDays = rentalDays;
        this.customer = customer;
        this.vehicle = vehicle;
    }

    public double calculateTotalCost() {
        return rentalDays * vehicle.getRentPerDay();
    }

    public void displayRentalDetails() {
        customer.displayCustomerDetails();
        System.out.println();

        vehicle.displayVehicleDetails();
        System.out.println("Rental Days : " + rentalDays);
        System.out.println("Total Amount : €" + calculateTotalCost());
    }
}