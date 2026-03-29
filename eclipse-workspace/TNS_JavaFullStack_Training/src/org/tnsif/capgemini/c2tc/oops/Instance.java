package org.tnsif.capgemini.c2tc.oops;

class Person5 {
}

class Employee5 extends Person5 {
}

class Manager extends Employee5 {
}

public class Instance {

    public static void main(String[] args) {

        Person5 person = new Person5();
        Employee5 employee = new Employee5();
        Manager manager = new Manager();

        System.out.println(employee instanceof Employee5); // true
        System.out.println(employee instanceof Person5);   // true
        System.out.println(employee instanceof Manager);   // false

        System.out.println(manager instanceof Manager);    // true
        System.out.println(manager instanceof Employee5);  // true
        System.out.println(manager instanceof Person5);    // true

        System.out.println(person instanceof Employee5);   // false
        System.out.println(person instanceof Manager);     // false
    }
}