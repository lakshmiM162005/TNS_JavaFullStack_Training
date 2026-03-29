package org.tnsif.capgemini.c2tc.final_keyword;

class ImplementByHema {

    public void show() {
        System.out.println("Ai integration done by hema");
    }
}

class Vishu extends ImplementByHema {

    public void show() {
        System.out.println("Ai integration done by vishu");
    }
}

public class FinalClass {

    public static void main(String[] args) {

        Vishu obj = new Vishu();
        obj.show();
    }
}