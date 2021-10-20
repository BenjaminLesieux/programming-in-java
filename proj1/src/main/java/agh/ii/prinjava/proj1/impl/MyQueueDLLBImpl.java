package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

/**
 * A queue works with the First in - First out principle.
 * One of the best way to implement a Queue is with a DoublyLinkedList.
 * This Queue is implemented with the {@link DLinkList} class
 *
 * @see MyQueue
 * @see DLinkList
 * */
public class MyQueueDLLBImpl<E> implements MyQueue<E> {

    /**
     * This Queue is implemented with {@link DLinkList} implementation of a DoublyLinkedList
     * */
    private DLinkList<E> elems;

    /**
     * Sole constructor to initiate the value of the private field {@code elems}
     * that represents our {@link DLinkList}.
     * */
    public MyQueueDLLBImpl() {
        this.elems = new DLinkList<>();
    }

    /**
     * Enqueuing an element means adding it at the last place of the Queue.
     * Thus, we use the {@link DLinkList#addLast(Object)} method of the {@link DLinkList} class.
     *
     * @param x The element to be added
     * @see MyQueue#enqueue(Object)
     * */
    @Override
    public void enqueue(E x) {
        this.elems.addLast(x);
    }

    /**
     * Dequeuing an element means removing the first element of the queue and returning its value.
     * Thus, we use the {@link DLinkList#removeFirst()} method of the {@link DLinkList} class.
     *
     * @see MyQueue#dequeue()
     * */
    @Override
    public E dequeue() {
        return this.elems.removeFirst();
    }

    /**
     * @return the number of elements in the Queue by calling {@link DLinkList#getSize()}
     * @see MyQueue#numOfElems()
     * */
    @Override
    public int numOfElems() {
        return this.elems.getSize();
    }

    /**
     * Peek is very similar to the {@link #dequeue()} method except that it doesn't remove
     * the first element. Therefore, we use the {@link DLinkList#seek(int)} with the parameter 0
     * so that the value of the first element is returned but not removed.
     *
     * @return the value of the first element of the Queue
     * @see MyQueue#peek()
     * */
    @Override
    public E peek() {
        return this.elems.seek(0);
    }
}
