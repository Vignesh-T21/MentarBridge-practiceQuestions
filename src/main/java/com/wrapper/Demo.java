package com.wrapper;

import java.util.*;

public class Demo {
    static void main(String[] args) {
      Child obj=new Child();
    }
}
class Parent{
    String name;
    int age;
    Parent(){
        System.out.println("Non-parameterized constructor called");
    }

    void display(){
        System.out.println("Greetings");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Child constructor called");
        super();
    }
    void display(){
        super.display();
    }
}
