package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

/**
 * A Stack works in the First In - Last Out principle. This Stack is implemented
 * with the {@link DLinkList} implementation of a DoublyLinkedList.
 * */
public class MyStackDLLBImpl<E> implements MyStack<E> {

    private DLinkList<E> elems;

    public MyStackDLLBImpl() {
        this.elems = new DLinkList<>();
    }

    /**
     * Popping the element of the Stack means removing its last element
     * and returning its value. This is equivalent to the {@link DLinkList#removeLast()}
     * method.
     *
     * @return {@link DLinkList#removeLast()}
     * @see MyStack#pop() 
     * */
    @Override
    public E pop() {
        return this.elems.removeLast();
    }

    /**
     * Pushing an element in a Stack means adding it at the last place.
     * This is equivalent to the {@link DLinkList#addLast(Object)} method.
     *
     * @param x The element to add at the last place
     * @see MyStack#push(Object)
     * */
    @Override
    public void push(E x) {
        this.elems.addLast(x);
    }

    /**
     * @return the number of elements in the Stack by calling {@link DLinkList#getSize()}
     * @see MyStack#numOfElems()
     * */
    @Override
    public int numOfElems() {
        return this.elems.getSize();
    }

    /**
     * Peek is very similar to the {@link #pop()} method except that it doesn't remove
     * the last element. Therefore, we use the {@link DLinkList#seek(int)} with the parameter (sizeOfList-1)
     * so that the value of the last element is returned but not removed.
     *
     * @return the value of the last element of the Queue
     * @see MyStack#peek()
     * */
    @Override
    public E peek() {
        return this.elems.seek(elems.getSize()-1);
    }

    @Override
    public String toString() {
        return this.elems.toString();
    }
}
