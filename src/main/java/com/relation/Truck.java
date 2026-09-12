package com.relation;

/**
 * Represents a truck in the Vehicle Rental Management System.
 *
 * <p>Truck is a child class of {@link Vehicle}, so it has an
 * IS-A relationship with Vehicle.</p>
 *
 * <p>This class adds the load capacity specific to a truck.</p>
 *
 * @author vignesh
 */
public class Truck extends Vehicle {

    private double loadCapacity;

    /**
     * Creates a new Truck object.
     *
     * @param vehicleNumber the unique registration number of the truck
     * @param brand the brand name of the truck
     * @param model the model name of the truck
     * @param rentPerDay the rental cost of the truck per day
     * @param loadCapacity the maximum load capacity of the truck in tons
     */
    public Truck(String vehicleNumber, String brand,
                 String model, double rentPerDay,
                 double loadCapacity) {

        super(vehicleNumber, brand, model, rentPerDay);
        this.loadCapacity = loadCapacity;
    }

    /**
     * Displays the details of the truck.
     *
     * <p>This method overrides the {@link Vehicle#displayVehicleDetails()}
     * method and adds truck-specific information such as load capacity.</p>
     */
    @Override
    public void displayVehicleDetails() {

        System.out.println("Vehicle Type : Truck");
        super.displayVehicleDetails();
        System.out.println("Load Capacity : " + loadCapacity + " tons");
    }
}