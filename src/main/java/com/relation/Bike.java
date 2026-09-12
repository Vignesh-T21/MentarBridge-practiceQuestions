package com.relation;

/**
 * Represents a bike that can be rented.
 *
 * <p>Bike extends {@link Vehicle} and adds engine capacity information.</p>
 *
 * @author vignesh
 */
public class Bike extends Vehicle {

    private int engineCapacity;
    /**
     * Creates a new Bike object.
     *
     * @param vehicleNumber the unique registration number of the bike
     * @param brand the brand name of the bike
     * @param model the model name of the bike
     * @param rentPerDay the rental cost of the bike per day
     * @param engineCapacity the engine capacity of the bike in cc
     */
    public Bike(String vehicleNumber, String brand,
                String model, double rentPerDay,
                int engineCapacity) {

        super(vehicleNumber, brand, model, rentPerDay);
        this.engineCapacity = engineCapacity;
    }
    /**
     * Displays the details of the bike.
     *
     * <p>This method overrides the {@link Vehicle#displayVehicleDetails()}
     * method and adds bike-specific information such as engine capacity.</p>
     */
    @Override
    public void displayVehicleDetails() {

        System.out.println("Vehicle Type : Bike");
        super.displayVehicleDetails();
        System.out.println("Engine Capacity : " + engineCapacity + " cc");
    }
}