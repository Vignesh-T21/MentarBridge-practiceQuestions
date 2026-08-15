package com.memoryspace;

//class MemoryArchitecture (class metaData) - is stored in MethodArea;
public class MemoryArchitecture {

    //static variables are stored in MethodArea
    //static variables only accessible static methods
    static String name="Vignesh T";
    static int age=20;


    //(non-static,object,instance,dynamic) variables are stored in Heap Memory;
    String studentName;
    int studentId;

    // Constructor metadata and bytecode are stored in the Method Area.
    public MemoryArchitecture(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    //Instance method bytecode is stored in MethodArea
    //non-static can access non-static variables
    void display() {
        System.out.println("Student : " + studentName);
        System.out.println("Id     : " + studentId);
    }

    //Static method  bytecode is stored in MethodArea
    //Static can access static variables
    static void showDetails(){
        System.out.println("Name :"+name);
        System.out.println("age :"+age);
    }

    public static void main(String args[]){
        MemoryArchitecture m1=new MemoryArchitecture("Vignesh T",1);
        // Object(new MemoryArchitecture("Vignesh T",1)) is stored in Heap Memory.
        // Reference variable m1 is stored in stack memory


        //primitive local variable is stored in Stack Memory.
        int marks=100;
        System.out.println("Marks :"+marks);
    }
}
