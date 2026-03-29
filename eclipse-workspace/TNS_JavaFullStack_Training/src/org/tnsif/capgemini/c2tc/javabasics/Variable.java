package org.tnsif.capgemini.c2tc.javabasics;

public class Variable {
int price=10; //instance variable
	
	void print()
	{
		String msg="Hello World" ; //local var
		System.out.println(msg);
		
	}
	static String message ="Hello Students"; //static var

	public static void main(String[] args) {
		Variable obj=new Variable();
		System.out.println("the value of price " + obj.price );
		obj.print();
		System.out.println(message);	
    
	}


}