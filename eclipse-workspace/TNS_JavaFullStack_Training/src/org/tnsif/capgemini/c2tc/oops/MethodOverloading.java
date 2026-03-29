package org.tnsif.capgemini.c2tc.oops;

class Calculator {

    // Method with 2 integers
    int add(int a, int b) {
        return a + b;
    }

    // Method with 3 integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with double values
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println(obj.add(5, 10));        // Calls 2-parameter method
        System.out.println(obj.add(5, 10, 15));    // Calls 3-parameter method
        System.out.println(obj.add(5.5, 2.5));     // Calls double method
    }
}