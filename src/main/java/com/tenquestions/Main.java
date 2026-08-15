package com.tenquestions;

import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String args[]){
        calculator();
    }
    static void factorial(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        System.out.println("Factorial of "+n+" is "+ans);
    }
    static void armStrong(int n){
        int temp=n;
        int count=count(n);
        int ans=0;
        while(n!=0){
            ans+=(int)Math.pow(n%10,count);
            n/=10;
        }
        if(ans==temp){
            System.out.println(temp+" is a armstrong number ");
        }else{
            System.out.println(temp+" isn't a armstrong number ");
        }
    }
    static void calculator(){
        System.out.println("Enter the operation you want to perform (+,-,/,%,*):");
        int operation = input.next().charAt(0);
        System.out.println("Enter the value of A & B :");
        int  a = input.nextInt();
        int b = input.nextInt();

        switch (operation){
            case '+':
                System.out.println("Addition of "+a+" + "+b +" is "+(a+b));
                break;
            case '-':
                System.out.println("Subtraction of "+a+" - "+b +" is "+(a-b));
                break;
            case '/':
                System.out.println("Division of "+a+" / "+b +" is "+(a/b));
                break;
            case '*':
                System.out.println("Multiplication of "+a+" * "+b +" is "+(a*b));
                break;
            default:
                System.out.println("Enter the correct inputs");
        }
    }
    static void prime(int n){
        boolean isBoolean=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isBoolean=false;
                System.out.println(n+ " is not a prime number");
                break;
            }
        }
        if(isBoolean){
            System.out.println(n+ " is a prime number");
        }

    }
    static void fibonacci(int n){
        System.out.println("Fibonacci series up to "+n);
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int temp=a;
            a=b;
            b=b+temp;
        }
    }
    static int reverse(int n){
        int ans=0;
        while(n!=0){
            ans=ans*10+(n%10);
            n/=10;
        }
        return ans;
    }
    static void palindrome(int n){
        if(n==reverse(n)){
            System.out.println(n+" is a palindrome ");
        }else{
            System.out.println(n+" is not a palindrome ");
        }
    }
    static int findLargest(int a,int b,int c){
        int max=a;
        if(max<b){
            max=b;
        }
        else if(max<c){
            max=c;
        }
        return max;
    }
    static void multiTable(int n){
        for(int i=1;i<=20;i++){
            System.out.println(i+" x "+n+" = "+(i*n));
        }
    }
    static void sumOfDigits(int n){
        int ans=0;
        while(n!=0){
            ans+=(n%10);
            n/=10;
        }
        System.out.println(" Sum of Digit is "+ans);
    }
    static int count(int n){
        int c=0;
        while(n!=0){
            c++;
            n/=10;
        }
        return c;
    }
}
