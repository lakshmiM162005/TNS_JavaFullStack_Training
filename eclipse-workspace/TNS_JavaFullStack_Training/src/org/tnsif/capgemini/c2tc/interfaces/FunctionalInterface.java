package org.tnsif.capgemini.c2tc.interfaces;

//Step 1: Create interface
interface InterfaceDemo3 {
 void sayHello(String name);
}

//Step 2: Implement interface
class GreetingsImp implements InterfaceDemo3 {

 @Override
 public void sayHello(String name) {
     System.out.println("Hello " + name + "!");
 }
}

//Step 3: Main class
public class FunctionalInterface {

 public static void main(String[] args) {

     InterfaceDemo3 obj = new GreetingsImp();
     obj.sayHello("Vishu");
 }
}
