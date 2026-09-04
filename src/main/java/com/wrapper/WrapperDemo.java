package com.wrapper;

import java.util.Arrays;
import java.util.Scanner;

public class WrapperDemo {
    static  Scanner input=new Scanner(System.in);
    static void main(String[] args) {
        System.out.println("Enter the size of the array (Names Array) :");
        int size=input.nextInt();
        String[] names=new String[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the name for index "+i+" :");
            names[i]=input.next();
        }
        for(String name:names){
            System.out.print(name+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(names));
        System.out.println("Enter two numbers for add(This will take as a String) :");
        String number1=input.next();
        String number2=input.next();
        int sum=Integer.parseInt(number2)+Integer.valueOf(number1);
        System.out.println("Sum :"+sum);

        System.out.println("\nWant to calculate average of five subjects (yes/no) :");
        String isWant=input.next().toLowerCase();
        if(isWant.equals("yes")){
            calculateAverage();
        }
    }
    static void calculateAverage(){
        System.out.println("\nEnter your five subjects mark :");
        String[] subjects={"Tamil","English","Maths","Science","Social Science"};
        int i=0;
        double sum=0;
        while (i<subjects.length){
            System.out.println("Enter "+subjects[i]+" marks :");
            sum+=input.nextInt();
            i++;
        }
        System.out.println("Average is "+sum/subjects.length);
    }
}
