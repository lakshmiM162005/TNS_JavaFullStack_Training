package org.tnsif.capgemini.c2tc.static_keyword;

class StaticBlockDemo
{
	public void display()
	{
		System.out.println("instance block-1");
	}
	static
	{
		System.out.println("static block-1");
	}
	static
	{
		System.out.println("static block-2");
	}
}

public class StaticBlock {

	public static void main(String[] args) {
		StaticBlockDemo obj=new StaticBlockDemo();
		obj.display();

	}

}