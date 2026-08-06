package com.workout;
import java.util.Scanner;

public class Calculator {
    //static variables are stored in method area:(global scope );
    static int a,b;
    static char operation;

    //Instance (dyanmic, non-static, Object) variables are stored in Heap memory
    int ans=0;


    //static methods (method area)
    static void add(int a,int b){
        System.out.println("Addition of a + b = "+(a+b));
    }
    static void mul(int a,int b){
        System.out.println("Multiplication of a * b = "+(a*b));
    }
    static void modulo(int a,int b){
        System.out.println("Modulo of a % b = "+(a%b));
    }



    //non-static(object, instance and dynamic) method stored in method area
    void sub(int a,int b){
        //error System.out.println("Subraction of a - b = "+a-b);
        //non-static var can be accessible in non-static methods
        ans=a-b;
        System.out.println("Subtraction of a - b = "+ans);
    }
    void div(int a,int b){
        //local variables stored in stack memory once finished it will automatically gone
        int div=a/b;
        System.out.println("Division of a / b = "+div);
    }

   public static void main(String[] args) {
        System.out.println("----------SIMPLE CALCULATOR----------");
      Scanner input=new Scanner(System.in);
      Calculator cal=new Calculator();


      while(true){
          System.out.println("Enter the operation you want to perform (+,-,/,%,*) or stop press y :");
          operation=input.next().charAt(0);
          if(operation=='y' || operation=='Y') break;

          System.out.println("Enter the value of A & B :");
          a=input.nextInt();
          b=input.nextInt();
          if(operation=='+') add(a,b);
          else if(operation=='-') cal.sub(a,b);
          else if(operation=='*') mul(a,b);
          else if(operation=='/') cal.div(a,b);
          else if(operation=='%') modulo(a,b);
          else{
              System.out.println("Enter the correct inputs");
          }
      }

    }
}
