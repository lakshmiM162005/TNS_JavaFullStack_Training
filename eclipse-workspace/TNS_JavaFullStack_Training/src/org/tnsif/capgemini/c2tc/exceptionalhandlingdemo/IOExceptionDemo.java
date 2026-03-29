package org.tnsif.capgemini.c2tc.exceptionalhandlingdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExceptionDemo {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\hemav\\OneDrive\\Desktop\\Java Notes\\demo.txt"));

            String data;

            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }

            br.close(); // good practice

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}