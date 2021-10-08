package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class LinkedListBasedImpl implements StackOfInts {

    private Node head;

    public LinkedListBasedImpl() {
    }

    @Override
    public int pop() {
        if (this.head.next == null) {
            int elem = head.elem;
            head = null;
            return elem;
        }

        else {
            Node finalNode = head;
            Node previous = head;

            while (finalNode.next != null) {
                previous = finalNode;
                finalNode = finalNode.next;
            }

            int elem = finalNode.elem;
            previous.next = null;
            return elem;
        }
    }

    @Override
    public void push(int x) {

        if (this.head == null) {
            this.head = new Node(x);
        }

        else {
            Node finalNode = head;

            while (finalNode.next != null) finalNode = finalNode.next;

            finalNode.next = new Node(x);
        }
    }

    @Override
    public int numOfElems() {

        int num = 0;

        for (Node node = head; node != null; node = node.next)
            num++;

        int numOfElems = num + 1;

        return numOfElems;
    }

    @Override
    public int peek() {

        if (this.head != null) {
            return this.head.elem;
        } else throw new IllegalStateException("To be implemented");
    }

    private static class Node {
        int elem;
        Node next;

        public Node(int elem) {
            this.elem = elem;
        }
    }
}
