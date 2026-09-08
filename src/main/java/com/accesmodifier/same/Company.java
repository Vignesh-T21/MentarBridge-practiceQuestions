package com.accesmodifier.same;


public class Company {

    private String privateData = "Private Data";
    String defaultData = "Default Data";
    protected String protectedData = "Protected Data";
    public String publicData = "Public Data";

    public void showDetails() {
        System.out.println("Inside Company:");

        System.out.println(privateData);
        System.out.println(defaultData);
        System.out.println(protectedData);
        System.out.println(publicData);
    }
}