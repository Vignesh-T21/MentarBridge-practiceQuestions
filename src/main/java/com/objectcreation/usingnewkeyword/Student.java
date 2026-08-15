package com.objectcreation.usingnewkeyword;

public class Student {
    //Using new keyword
    private String name;
    private int age;

    // Constructor
    public Student() {
        this.name = "Vignesh";
        this.age = 21;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        //Using new keyword
        Student student1 = new Student();
        System.out.println("Using new keyword");
        student1.display();
    }
}
