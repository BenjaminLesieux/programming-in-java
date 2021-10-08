package agh.ii.prinjava.lab02.lst02_07;
/*
 * An interface is a mechanism for specifying a contract between two parties:
 *   the supplier of a service and the classes that want their objects to be usable with the service.
 */

//interface I7 implements I5, I4 {} //  No implements clause allowed for interface

public class Main {
    private static void demo1() {
        System.out.println("demo1...");
        I5 i3 = new C3();
        i3.m3();
    }

    private static void demo2() {
        System.out.println("demo2...");
        I4 i4 = new C3(); // C3 implements I4, I5
        i4.m1();
        i4.m2();

        I5 i5 = (I5) i4; // <- (!), I4 i4 = new C3(); C3 implements I4, I5
        i5.m3();
        //i5.sm1(); // Error: static method may be invoked on containing interface class only
        I5.sm1();

        I6 i6 = new C4();
        i6.m1();
        i6.m3();
        i6.m2();
    }

    public static void main(String[] args) {
        demo1();
        System.out.println();

        demo2();
    }
}
