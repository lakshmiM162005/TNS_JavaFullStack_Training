package org.tnsif.capgemini.c2tc.final_keyword;

class calc {

    public final void show() {
        System.out.println("AI integration done by hema");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

class Advcalc extends calc {

    // ❌ Cannot override show()

    public void add(int a, int b) {
        System.out.println("welcome");
    }
}

public class FinalMethod {

    public static void main(String[] args) {

        Advcalc obj = new Advcalc();

        obj.show();      // from parent (final method)
        obj.add(10, 20); // child method
    }
}