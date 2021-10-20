package agh.ii.prinjava.lab03.exc03_01.impl;

import java.io.Serializable;

public class LinkedListBasedImpl implements QueueOfInts, Serializable {

    private Node first = null;
    private Node last = null;

    private transient int numOfElems = 0;

    public LinkedListBasedImpl() {

    }

    @Override
    public void enqueue(int x)  {

        if (first == null || last == null) {
            first = new Node(x, null, null);

            first.next = null;
            first.prev = null;

            last = first;

        }

        else {
            last.next = new Node(x, null, last);
            last = last.next;
        }
    }

    @Override
    public int dequeue() {

        if (first == null || last == null) throw new IllegalStateException("There is no element in the queue to dequeue");

        Node node = first;
        first = first.next;

        if (first == null) {
            last = null;
        }

        else {
            first.prev = null;
        }
        
        return node.elem;
    }

    @Override
    public int numOfElems() {

        if (first == null) return 0;

        numOfElems = 0;
        for (Node node = first; node != null; node = node.next) numOfElems++;

        return numOfElems;
    }

    @Override
    public int peek() {

        if (first != null) {
            return first.elem;
        }

        throw new IllegalStateException("There is no head in the list");
    }

    private static class Node implements Serializable {
        int elem;
        Node next;
        Node prev;

        public Node(int elem, Node next, Node prev) {
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public String toString() {
        return "Queue with " + numOfElems() + " elements and " + first.elem + " as first and " + last.elem + " as last";
    }
}
