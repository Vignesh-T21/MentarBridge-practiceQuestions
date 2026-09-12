package com.relation;
/**
 * Represents a vehicle in the Vehicle Rental Management System.
 *
 * <p>This is the parent class for different types of vehicles
 * such as {@link Car}, {@link Bike}, and {@link Truck}.</p>
 *
 * <p>The child classes have an IS-A relationship with Vehicle.</p>
 *
 * @author vignesh
 */
public class Vehicle {

    private final String vehicleNumber;
    private final String brand;
    private final String model;
    private final double rentPerDay;

    /**
     * Creates a new Vehicle object.
     *
     * @param vehicleNo the unique registration number of the vehicle
     * @param brand the brand name of the vehicle
     * @param model the model name of the vehicle
     * @param rentPerDay the rental cost of the vehicle per day
     */
    public Vehicle(String vehicleNo, String brand, String model, double rentPerDay) {
        vehicleNumber = vehicleNo;
        this.brand = brand;     //this refers to current object
        this.model = model;
        this.rentPerDay = rentPerDay;
    }

    /**
     * Returns the rental cost of the vehicle per day.
     *
     * @return the rental cost per day
     */
    public double getRentPerDay() {
        return rentPerDay;
    }

    /**
     * Displays the details of the vehicle.
     *
     * <p>This method displays the vehicle number, brand,
     * model, and rental cost per day.</p>
     */
    public void displayVehicleDetails() {
        System.out.println("Vehicle No : " + vehicleNumber);
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Rent Per Day : €" + rentPerDay);
    }
}