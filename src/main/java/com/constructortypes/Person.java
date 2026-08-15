package com.constructortypes;

public class Person {

    private String personName;
    private int age;
    static String city="karur";


    //constructor name and class name must be same
    //used to initialize object variables
    //No argument Constructor
    public Person() {
        System.out.println("No argument constructor is called");
        this.personName = "Vignesh";
        this.age = 21;
    }

    //Parameterized Constructor
    public Person(String personName, int age) {
        System.out.println("Parameterized constructor is called");
        this.personName = personName;
        this.age = age;
    }

    //Copy Constructor
    public Person(Person obj) {
        System.out.println("Copy constructor is called");
        this.personName = obj.personName;
        this.age = obj.age;
    }

    public static void main(String[] args) {


        // this keyword refers current object
        //calling no argument constructor
        Person person1 = new Person();
        System.out.println("Name: " + person1.personName);
        System.out.println("Age: " + person1.age);



        //calling parameterized constructor
        Person person2 = new Person("Yuvaraja", 20);
        System.out.println("Name: " + person2.personName);
        System.out.println("Age: " + person2.age);



        //calling copy constructor
        Person person3 = new Person(person1);
        System.out.println("Name: " + person3.personName);
        System.out.println("Age: " + person3.age);



        Singleton obj=Singleton.getInstance();
        obj.display();
    }
}




