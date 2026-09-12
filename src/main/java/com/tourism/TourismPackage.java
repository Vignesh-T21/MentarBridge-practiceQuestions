package com.tourism;

abstract class TourismPackage {
    private String packageId;
    private String destination;
    private int days;
    private int travelers;
    private double basePrice;

    public TourismPackage(String packageId, String destination, int days, int travelers, double basePrice) {
        this.packageId = packageId;
        this.destination = destination;
        this.days = days;
        this.travelers = travelers;
        this.basePrice = basePrice;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getTravelers() {
        return travelers;
    }

    public void setTravelers(int travelers) {
        this.travelers = travelers;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void displayPackageDetails() {
        System.out.println("Package ID   : " + packageId);
        System.out.println("Destination  : " + destination);
        System.out.println("Days         : " + days);
        System.out.println("Travelers    : " + travelers);
        System.out.println("Base Price   : " + basePrice);
        System.out.println("Package Type : " + getClass().getSimpleName());
    }


    public abstract double calculateFinalPrice();
}
