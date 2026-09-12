package com.tourism;

public class AdventureTourism extends TourismPackage {
    public AdventureTourism(String packageId, String destination, int days, int travelers, double basePrice) {
        super(packageId, destination, days, travelers, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return getBasePrice() + (getBasePrice() * 0.15);
    }
}
