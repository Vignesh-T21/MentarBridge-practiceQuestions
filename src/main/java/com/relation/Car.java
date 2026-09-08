package com.relation;

public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String vehicleNumber, String brand, String model, double rentPerDay, int numberOfDoors) {
        super(vehicleNumber, brand, model, rentPerDay);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayVehicleDetails() {
        System.out.println("Vehicle Type : Car");
        super.displayVehicleDetails();
        System.out.println("Number of Doors : " + numberOfDoors);
    }
}