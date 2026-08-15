package com.objectcreation.usingclone;

public class Student implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Student student1 = new Student("Vignesh", 21);

        // Creating object using clone()
        Student student2 = (Student) student1.clone();

        System.out.println("Original Object:");
        student1.display();

        System.out.println();

        System.out.println("Cloned Object:");
        student2.display();
    }
}
