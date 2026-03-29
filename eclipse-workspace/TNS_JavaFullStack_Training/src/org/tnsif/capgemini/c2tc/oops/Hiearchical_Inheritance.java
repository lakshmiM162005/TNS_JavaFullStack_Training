package org.tnsif.capgemini.c2tc.oops;

class Employee {
    void company() {
        System.out.println("Company: TechCrop");
    }
}

class Developer extends Employee {
    void role() {
        System.out.println("Role: Software Engineer");
    }
}

class Tester extends Employee {
    void role() {
        System.out.println("Role: Tester");
    }
}
public class Hiearchical_Inheritance {
	public static void main(String[] args) {

        Developer d = new Developer();
        Tester t = new Tester();

        d.company();
        d.role();

        t.company();
        t.role();
    }

}