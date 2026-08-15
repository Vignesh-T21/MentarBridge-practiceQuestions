package com.memoryspace;


import java.util.Scanner;

public class StudentAdministration {
    public static void main(String[] vignesh) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to student Administration:");
        System.out.println("Kindly enter the student name :");
        //name,birth
        String name=input.nextLine();
        System.out.println("Enter student date of birth (DD/MM/YY):");
        String birth=input.nextLine();
        System.out.println("Congratulation student registration complete");
        System.out.println("Student name :"+name);
        System.out.println("Student Date of birth:"+birth);

        String age=birth.substring(6);
        int birthYear=Integer.parseInt(age);
        System.out.println(2027-birthYear);

    }
}
