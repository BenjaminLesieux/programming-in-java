package agh.ii.prinjava.lab02.lst02_02;

public class Main {
    public static void main(String[] args) {
        DerivedClass dc = new DerivedClass();
        System.out.println("\nAbout to call fM1, m2, m3, and fm4...");
        dc.fM1();
        dc.m2();
        dc.m3();
        dc.fM4();
    }
}
