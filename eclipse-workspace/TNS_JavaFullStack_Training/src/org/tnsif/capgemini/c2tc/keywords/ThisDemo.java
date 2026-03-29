package org.tnsif.capgemini.c2tc.keywords;

class Person{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name " + name);
        System.out.println("Age " + age);
    }
}
public class ThisDemo {

	public static void main(String[] args) {
		Person person = new Person();

        person.setName("Alice");
        person.setAge(20);
        person.displayDetails();
        person.setName("Bob");
        person.setAge(40);
        person.displayDetails();
    }
}