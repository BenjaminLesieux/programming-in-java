package agh.ii.prinjava.lab04.exc04_02.impl;

import agh.ii.prinjava.lab04.exc04_02.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems;

    public MyQueueDLLBImpl() {
        this.elems = new DLinkList<>();
    }

    @Override
    public void enqueue(E x) {
    }

    @Override
    public E dequeue() {
        throw new IllegalStateException("To be implemented");
    }

    @Override
    public int numOfElems() {
        return 0;
    }

    @Override
    public E peek() {
        throw new IllegalStateException("To be implemented");
    }
}
