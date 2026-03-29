package org.tnsif.capgemini.c2tc.javabasics;

public class TypeCasting {

    public static void main(String[] args) {

        // Widening (small → large)
        int quantity = 3;
        double priceperitem = 99.5;

        double totalprice = quantity * priceperitem; // int → double (automatic)

        System.out.println("Total price with widening: " + totalprice);

        // Narrowing (large → small)
        double discount = 10.75;

        int roundeddiscount = (int) discount; // explicit casting (double → int)

        // Final amount after discount
        double finalAmount = totalprice - roundeddiscount;

        System.out.println("Rounded discount (narrowing): " + roundeddiscount);
        System.out.println("Final amount after discount: " + finalAmount);
    }
}