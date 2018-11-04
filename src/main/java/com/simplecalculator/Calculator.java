package com.simplecalculator;

public class Calculator {

    //int a;
    //int b;

    public void addAToB(int a ,int b){

        int sum=a+b;
        System.out.println("The sum result: " + sum);
    }
    public void substractAFromB(int a,int b){

        int substraction=a-b;
        System.out.println("The substraction result:  " + substraction);
    }
    public void aDivideB(int a, int b) {

        if (b != 0) {
            double division = a / b;
            System.out.println("The division result:  " + division);
        } else System.out.println("Error");
    }
    public void aMultiplyB(int a, int b) {

        int multiplication=a*b;
        System.out.println("The multiplication result: " + multiplication);
    }
}
