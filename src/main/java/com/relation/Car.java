package com.relation;

/**
 * Represents a car in the Vehicle Rental Management System.
 *
 * <p>Car is a child class of {@link Vehicle}, so it has an
 * IS-A relationship with Vehicle.</p>
 *
 * <p>This class adds the number of doors specific to a car.</p>
 *
 * @author vignesh
 */
public class Car extends Vehicle {

    private int numberOfDoors;

    /**
     * Creates a new Car object.
     *
     * @param vehicleNumber the unique registration number of the car
     * @param brand the brand name of the car
     * @param model the model name of the car
     * @param rentPerDay the rental cost of the car per day
     * @param numberOfDoors the number of doors in the car
     */
    public Car(String vehicleNumber, String brand, String model, double rentPerDay, int numberOfDoors) {
        super(vehicleNumber, brand, model, rentPerDay);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Displays the details of the car.
     *
     * <p>This method overrides the {@link Vehicle#displayVehicleDetails()}
     * method and adds car-specific information such as the number of doors.</p>
     */
    @Override
    public void displayVehicleDetails() {
        System.out.println("Vehicle Type : Car");
        super.displayVehicleDetails();
        System.out.println("Number of Doors : " + numberOfDoors);
    }
}