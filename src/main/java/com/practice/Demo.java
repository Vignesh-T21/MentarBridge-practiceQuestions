package com.practice;


//has a relation
class Engine{
    void start(){
        System.out.println("Engine is started");
    }
}
class Car{   //one class contains  an instance of another class as a member variable
    private final Engine engine;
    Car(Engine engine){
        this.engine=engine;
    }
    void drive(){
        System.out.println("Car is running");
        engine.start();
    }
}
public class Demo {
    static void main(String[] args) {
        Engine engine=new Engine();
       Car car=new Car(engine);
       car.drive();
    }
}
