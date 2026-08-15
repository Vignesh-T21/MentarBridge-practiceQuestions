package com.constructortypes;

public class Main {
    String name;
    Main(){
        this.name="vignesh";
        System.out.println("constructor called.");
    }

    public static void main(String[] args) {
        Main obj=new Main();
        System.out.println( obj.name);

    }
}
