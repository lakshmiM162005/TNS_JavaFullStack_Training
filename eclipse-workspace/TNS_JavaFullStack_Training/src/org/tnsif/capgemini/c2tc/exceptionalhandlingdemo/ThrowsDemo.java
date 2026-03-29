package org.tnsif.capgemini.c2tc.exceptionalhandlingdemo;

import java.io.IOException;

public class ThrowsDemo {

    void m1() {
        System.out.println("No Exception");
    }

    void m2() throws IOException {
        System.out.println("Device error");
    }

    void m3() throws ArithmeticException, IOException, ClassNotFoundException {
        System.out.println("File not Found");
    }

    public static void main(String[] args) {
        ThrowsDemo obj = new ThrowsDemo();

        obj.m1();

        try {
            obj.m2();
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            obj.m3();
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}