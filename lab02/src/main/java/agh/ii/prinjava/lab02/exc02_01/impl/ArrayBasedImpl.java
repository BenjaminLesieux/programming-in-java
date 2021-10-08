package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class ArrayBasedImpl implements StackOfInts {

    private int[] ints;

    public ArrayBasedImpl() {
        ints = new int[0];
    }

    private int[] copyArrayUntil(int throwIndex) {
        int[] shrinkedArray = new int[throwIndex];

        for (int i = 0; i < throwIndex; i++) // Here I do a manual array copy instead of using the build-in
            shrinkedArray[i] = ints[i];            // System function

        return shrinkedArray;
    }

    @Override
    public int pop() {
        if (ints.length > 0) {

            int last = ints[ints.length-1];
            ints = copyArrayUntil(ints.length-1);

            return last;
        } else throw new IllegalStateException("The array is empty");
    }

    @Override
    public void push(int x) {
        if (ints != null) {
            int[] biggerArray = new int[ints.length + 1];

            for (int i = 0; i < ints.length; i++) biggerArray[i] = ints[i];

            biggerArray[ints.length] = x;
            ints = biggerArray;
        }
    }

    @Override
    public int numOfElems() {
        int value = 0;

        for (int i = 0; i < ints.length; i++) value++;

        return value;
    }

    @Override
    public int peek() {
        if (ints.length > 0) {
            int[] smallerArray = new int[ints.length-1];

            for (int i = 1; i < ints.length; i++) {
                smallerArray[i-1] = ints[i];
            }

            int value = ints[0];
            ints = smallerArray;

            return value;
        }
        throw new IllegalStateException("There is no head in this Array");
    }
}
