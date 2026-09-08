package com.practice;

//Is a relation
class Vehicle{
    private String vehicleNumber;
    private String brand;
    private String model;

    public Vehicle(String vehicleNumber, String brand, String model) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.model = model;
    }
    void display(){
        System.out.println(vehicleNumber);
    }
}
class Bike extends Vehicle{
    public Bike(String vehicleNumber, String brand, String model) {
        super(vehicleNumber, brand, model);
    }

}
public class Demo2 {
    static void main(String[] args) {
       Bike bike=new Bike("BE-123-ABC", "Toyota", "Corolla");
       bike.display();
    }
}