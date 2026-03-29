package org.tnsif.capgemini.c2tc.oops;

public class FoodItems {

    // properties
    String name;
    double price;
    String category;

    // method
    void display() {
        System.out.println("Food name : " + name);
        System.out.println("Price : " + price);
        System.out.println("Category : " + category);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {

        FoodItems obj1 = new FoodItems();
        obj1.name = "Veg Burger";
        obj1.price = 250;
        obj1.category = "Fast Food";

        FoodItems obj2 = new FoodItems();
        obj2.name = "Paneer Pizza";
        obj2.price = 300;
        obj2.category = "Italian";

        FoodItems obj3 = new FoodItems();
        obj3.name = "Cold Coffee";
        obj3.price = 200;
        obj3.category = "Beverage";

        FoodItems obj4 = new FoodItems();
        obj4.name = "Pan Cake";
        obj4.price = 180;
        obj4.category = "Dessert";

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}