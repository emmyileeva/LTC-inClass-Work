package org.example;

public class Calculator {

    //Instance variables
    // They are different for every instance of an object
    public String brand;
    public double userFirstNumber;
    public double userSecondNumber;

    // Methods what can a calculator do?
    // Addition, subtraction, multiplication, division
    // Formulas
    public void Add() {
        System.out.println("Doing addition.");
//       double result = this.userFirstNumber + this.userSecondNumber;
//        System.out.println(result);
    }

    public void Subtract() {
        System.out.println("Doing subtraction.");
//        double result = this.userFirstNumber + this.userSecondNumber;
//        System.out.println(result);
    }

    // Void means the method does not return a result... outside the method

    // Static method does not need object data, can be always
    public static double Add(double _numberA, double _numberB) {
        return _numberA + _numberB;
    }

    public static double Subtract(double _numberC, double _numberD) {
        return _numberC - _numberD;
    }

    // User input
}
