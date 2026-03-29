package org.tnsif.capgemini.c2tc.constructor;

class Myclass
{
	String color;
	int cost;
	String Brand;
}
public class BeforeConstructor {

	public static void main(String[] args) {
		Myclass obj=new Myclass();
		System.out.println(obj.color + " " + obj.cost + "  " + obj.Brand);

	}

}