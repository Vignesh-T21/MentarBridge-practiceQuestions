package com.relation;

/**
 * @author  vignesh
 */
public class Vehicle {

    private final String vehicleNumber;
    private final String brand;
    private final String model;
    private final double rentPerDay;

    /**
     *
     * @param vehicleNo
     * @param brand
     * @param model
     * @param rentPerDay
     */
    public Vehicle(String vehicleNo, String brand, String model, double rentPerDay) {
        vehicleNumber = vehicleNo;
        this.brand = brand;     //this refers to current object
        this.model = model;
        this.rentPerDay = rentPerDay;
    }

    public double getRentPerDay() {
        return rentPerDay;
    }

    public void displayVehicleDetails() {
        System.out.println("Vehicle No : " + vehicleNumber);
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Rent Per Day : €" + rentPerDay);
    }
}