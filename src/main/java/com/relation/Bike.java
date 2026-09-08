package com.relation;

public class Bike extends Vehicle {

    private int engineCapacity;

    public Bike(String vehicleNumber, String brand,
                String model, double rentPerDay,
                int engineCapacity) {

        super(vehicleNumber, brand, model, rentPerDay);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayVehicleDetails() {

        System.out.println("Vehicle Type : Bike");
        super.displayVehicleDetails();
        System.out.println("Engine Capacity : " + engineCapacity + " cc");
    }
}