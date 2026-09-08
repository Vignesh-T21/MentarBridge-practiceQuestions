package com.accesmodifier.same;


public class Company {

    private String privateData = "Private Data";  //same class
    String defaultData = "Default Data";  //same package
    protected String protectedData = "Protected Data";  //other package + subclass
    public String publicData = "Public Data";   //public

    public void showDetails() {
        System.out.println("Inside Company:");

        System.out.println(privateData);
        System.out.println(defaultData);
        System.out.println(protectedData);
        System.out.println(publicData);
    }
}