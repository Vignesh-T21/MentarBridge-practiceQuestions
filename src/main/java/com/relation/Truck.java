package com.relation;

public class Truck extends Vehicle {

    private double loadCapacity;

    public Truck(String vehicleNumber, String brand,
                 String model, double rentPerDay,
                 double loadCapacity) {

        super(vehicleNumber, brand, model, rentPerDay);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayVehicleDetails() {

        System.out.println("Vehicle Type : Truck");
        super.displayVehicleDetails();
        System.out.println("Load Capacity : " + loadCapacity + " tons");
    }
}