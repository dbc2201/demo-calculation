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

    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(double dividend, double divisor) {
        if (divisor == 0.0) {
            return 0.0;
        }
        return dividend / divisor;
    }
}