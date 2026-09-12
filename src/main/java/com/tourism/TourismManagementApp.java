package com.tourism;

public class TourismManagementApp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("          DHILTOUR TRAVELS");
        System.out.println("========================================");


        Tourist tourist1 = new Tourist();

        tourist1.setTouristId(53);
        tourist1.setTouristName("Joy boy");
        tourist1.setEmail("joyboy@gmail.com");
        tourist1.setPhone("9876501234");




        Tourist tourist2 = new Tourist(101, "Vignesh", "vignesh@gmail.com", "8765409876");
        System.out.println("\n----------- TOURIST 1 -----------");
        tourist1.displayTouristInfo();
        System.out.println("\n----------- TOURIST 2 -----------");
        tourist2.displayTouristInfo();

        TourismPackage package1 = new DomesticTourism("DT201", "Kerala", 4, 3, 35000);
        TourismPackage package2 = new InternationalTourism("IT202", "Singapore", 8, 2, 85000);
        TourismPackage package3 = new AdventureTourism("AT203", "Rishikesh", 5, 4, 45000);


        TourismPackage[] packages = {package1, package2, package3};

        System.out.println("\n========================================");
        System.out.println("          TOURISM PACKAGES");
        System.out.println("========================================");
        for (TourismPackage tourismPackage : packages) {
            System.out.println("\n----------------------------------------");
            tourismPackage.displayPackageDetails();
            System.out.println("Final Price  : " + tourismPackage.calculateFinalPrice());
        }
    }
}
