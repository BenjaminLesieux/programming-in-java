package agh.ii.prinjava.lab05.lst05_02;

import java.util.*;
import java.util.function.Consumer;

public class Main {

    /** Using iterators */
    private static void demo1() {
        int itArrSize = 5;
        IterableArray<Integer> itArr = new IterableArray<>(itArrSize);
        for (int i = 0; i < itArrSize; i++) {
            itArr.set(i, 10 * i);
        }

        System.out.println(itArr);

        // (1) Iterator with the while loop
        var it1 = itArr.iterator();
        while (it1.hasNext()) {
            int e = it1.next();
            System.out.print(e + " ");
        }
        System.out.println("\n---");

        // (2) Iterator with the for loop
        for (var it = itArr.iterator(); it.hasNext(); ) {
            int e = it.next();
            System.out.print(e + " ");
        }
        System.out.println("\n---");

        // (3) Enhanced for-loop
        for (var e : itArr) {
            System.out.print(e + " ");
        }
        System.out.println("\n---");

        // (4) forEach method
        itArr.forEach(e -> System.out.print(e + " "));
    }

    public static void main(String[] args) {
        demo1();

        List<Integer> ints = List.of(1,2,3,4,5);

        System.out.println("\nfor loop");
        for (int i = 0; i < ints.size(); i++) System.out.println(ints.get(i));

        System.out.println("for loop enhanced");
        for (Integer anInt : ints) System.out.println(anInt);

        System.out.println("iterator");
        Iterator<Integer> it = ints.iterator();
        while(it.hasNext()) System.out.println(it.next());

        System.out.println("forEach function");
        ints.forEach(System.out::println);
    }
}
