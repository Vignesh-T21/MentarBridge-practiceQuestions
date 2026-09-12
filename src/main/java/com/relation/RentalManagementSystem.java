package com.relation;


/**
 * Main class of the Vehicle Rental Management System.
 *
 * <p>This class demonstrates how the different classes in the
 * rental management system work together.</p>
 *
 * <p>The system demonstrates the following OOP relationships:</p>
 *
 * <ul>
 *     <li>Car IS-A Vehicle</li>
 *     <li>Bike IS-A Vehicle</li>
 *     <li>Truck IS-A Vehicle</li>
 *     <li>Customer HAS-A Address</li>
 *     <li>Rental HAS-A Customer</li>
 *     <li>Rental HAS-A Vehicle</li>
 * </ul>
 *
 * <p>It also demonstrates inheritance, method overriding,
 * polymorphism, and object relationships.</p>
 *
 * @author vignesh
 */
public class RentalManagementSystem {
    /**
     * Creates a new RentalManagementSystem object.
     */
    public RentalManagementSystem() {
    }

    /**
     * Entry point of the Vehicle Rental Management System.
     *
     * <p>This method creates Address, Customer, Vehicle, and Rental
     * objects and displays their details.</p>
     *
     * <p>The method also demonstrates polymorphism by storing
     * {@link Car}, {@link Bike}, and {@link Truck} objects in
     * {@link Vehicle} references.</p>
     *
     * @param args command-line arguments
     */
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