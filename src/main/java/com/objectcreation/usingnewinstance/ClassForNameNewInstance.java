package com.objectcreation.usingnewinstance;

public class ClassForNameNewInstance {
    private String name;

    // Constructor
    public ClassForNameNewInstance() {
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
            // Loading class dynamically
            Class<?> clazz =Class.forName("com.objectcreation.usingnewinstance.ClassForNameNewInstance");

            // Creating object using newInstance()
            ClassForNameNewInstance obj =(ClassForNameNewInstance) clazz.newInstance();

            obj.setName("Vignesh");

            obj.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}