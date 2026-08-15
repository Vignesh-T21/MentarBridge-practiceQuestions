package com.objectcreation.usingnewinstance;
import java.lang.reflect.Constructor;

public class ConstructorNewInstance {

    private String name;
    // Constructor
    public ConstructorNewInstance() {
        System.out.println("Constructor is called");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        try {

            // Getting Constructor object
            Constructor<ConstructorNewInstance> constructor =ConstructorNewInstance.class.getDeclaredConstructor();

            // Creating object using Constructor.newInstance()
            ConstructorNewInstance obj =constructor.newInstance();

            obj.setName("Vignesh");
            obj.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}