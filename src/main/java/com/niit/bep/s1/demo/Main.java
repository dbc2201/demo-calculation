package com.niit.bep.s1.demo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    // method to add two numbers
    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtract(double firstNumber, double secondNumber) {
        if (secondNumber > firstNumber) {
            return secondNumber - firstNumber;
        } else return firstNumber - secondNumber;
    }

}