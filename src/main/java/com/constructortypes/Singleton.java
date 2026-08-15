package com.constructortypes;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("Private constructor is called");
    }
    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
     void display(){
        System.out.println("Hi, I'm display method from Singleton class");
    }
    private void greeting(){
        System.out.println("Greetings from Singleton");
    }
}
