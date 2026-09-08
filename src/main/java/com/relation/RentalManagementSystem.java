package com.relation;

public class RentalManagementSystem {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("       VEHICLE RENTAL MANAGEMENT");
        System.out.println("========================================");

        Address address = new Address("24", "Main Road", "karur", "1000");
        Customer customer = new Customer("C101", "Vignesh T", "9876543210", address);
        Vehicle vehicle = new Car("BE-123-ABC", "Toyota", "Corolla", 50, 4);
        Rental rental = new Rental("R101", 4, customer, vehicle);

        rental.displayRentalDetails();

        System.out.println();

        System.out.println("Car IS-A Vehicle");
        System.out.println("Bike IS-A Vehicle");
        System.out.println("Truck IS-A Vehicle");

        System.out.println("Customer HAS-A Address");
        System.out.println("Rental HAS-A Customer");
        System.out.println("Rental HAS-A Vehicle");

        System.out.println();


        Vehicle bike = new Bike("BE-456-DKE", "KTM", "Duke", 30, 390);

        Vehicle truck = new Truck("BE-789-TRK", "Tata", "Prima", 100, 10);

        bike.displayVehicleDetails();
        System.out.println();
        truck.displayVehicleDetails();
        System.out.println("========================================");
    }
}