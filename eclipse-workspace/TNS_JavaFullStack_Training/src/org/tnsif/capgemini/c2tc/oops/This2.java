package org.tnsif.capgemini.c2tc.oops;

class Person2 {

    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;   // using 'this' keyword
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;     // using 'this' keyword
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("name " + name);
        System.out.println("age " + age);
    }
}

public class This2 {

    public static void main(String[] args) {

        Person2 obj = new Person2();

        obj.setName("alice");
        obj.setAge(20);

        obj.setName("joel");   // overwriting previous value
        obj.setAge(30);

        obj.displayDetails();
    }
}