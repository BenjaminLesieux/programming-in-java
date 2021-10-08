package agh.ii.prinjava.lab03.lst03_10;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;

public class Main {


    public static void test(boolean b) {
        if (b) throw new IllegalArgumentException("Not supposed to be true");
        else {
            System.out.println("Hello");
        }
    }

    public static void delete(String path) throws SecurityException {
        File file = new File(path);

        file.deleteOnExit();
    }

    private static void shalowCloneDemo() {
        System.out.println("shalowCloneDemo...");

        ShalowCloner sc1 = new ShalowCloner();
        System.out.println("sc1: " + sc1);
        try {
            ShalowCloner sc1Clone = (ShalowCloner) sc1.clone(); // <- Object clone() throws...;
            System.out.println("sc1Clone: " + sc1Clone);

            System.out.println("\nUpdating the clone (setting ints[0] to 100)...");
            sc1Clone.setIntAtIdx(0, 100);

            System.out.println("sc1Clone: " + sc1Clone);
            System.out.println("sc1: " + sc1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private static void deepCloneDemo() {
        System.out.println("deepCloneDemo...");

        DeepCloner dc1 = new DeepCloner();
        System.out.println("dc1: " + dc1);
        try {
            DeepCloner dc1Clone = (DeepCloner) dc1.clone();
            System.out.println("dc1Clone: " + dc1Clone);

            System.out.println("\nUpdating the clone (setting ints[0] to 100)...");
            dc1Clone.setIntAtIdx(0, 100);

            System.out.println("dc1Clone: " + dc1Clone);
            System.out.println("dc1: " + dc1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.err.println("turtur");
        }
    }

    public static void main(String[] args) {
        shalowCloneDemo();
        System.out.println();
        deepCloneDemo();

        try {
            delete("true");
        } catch (SecurityException e) {
            e.printStackTrace();

        }
        test(false);
    }
}
