package org.tnsif.capgemini.c2tc.javabasics;

public class DataTypes {

    public static void main(String[] args) {

        // primitive datatype
        int orderid = 101;
        double price = 299.99;
        boolean isDelivered = false;
        char rating = 'A';
        float deliveryDistance = 5.3f;
        long deliveryBoyNumber = 93273828291L;
        byte deliveryTime = 45;
        short restaurantid = 12;

        // non-primitive datatype
        String customerName = "Nitin";
        String[] fooditems = {"Burger", "Fries", "coke"};

        System.out.println("Order Summary");
        System.out.println("Customer Name " + customerName);
        System.out.println("Order id " + orderid);
        System.out.println("Restaurant id " + restaurantid);
        System.out.println("Delivery Boy Number " + deliveryBoyNumber);
        System.out.println("Is Delivered: " + isDelivered);

        System.out.println("Food items:");
        for (String items : fooditems) {
            System.out.println(items);
        }

        System.out.println("Total Price " + price);
        System.out.println("Delivery Distance " + deliveryDistance);
        System.out.println("Expected time " + deliveryTime);
        System.out.println("Rating " + rating);
    }
}