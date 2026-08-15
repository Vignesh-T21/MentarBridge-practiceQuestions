package com.objectcreation.usingdeserilization;
import java.io.*;

class Student implements Serializable {
    private String name;
    private int age;

    // Constructor
    Student(String name, int age) {
        System.out.println("Student constructor called!");
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

public class Deserialization {
    public static void main(String[] args) {
        Student s1 = new Student("Vignesh", 21);

        System.out.println("\nOriginal object:");
        s1.display();

        try {

            FileOutputStream fileOut =new FileOutputStream("student.ser");
            ObjectOutputStream out =new ObjectOutputStream(fileOut);

            // Object → Byte Stream
            out.writeObject(s1);
            out.close();
            fileOut.close();
            System.out.println("\nObject serialized successfully.");

        } catch (IOException e) {
            System.out.println("Serialization failed!");
            e.printStackTrace();
        }
        try {

            FileInputStream fileIn =new FileInputStream("student.ser");

            ObjectInputStream in =new ObjectInputStream(fileIn);

            // Byte Stream → Object
            Student s2 = (Student) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("\nObject deserialized successfully.");

            System.out.println("\nDeserialized object:");
            s2.display();

            // Check whether they are the same object
            System.out.println("\nAre s1 and s2 the same object?");
            System.out.println(s1 == s2);

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization failed!");
            e.printStackTrace();
        }
    }
}