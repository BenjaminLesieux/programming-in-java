package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.DLinkList;
import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

/**
 * A Stack works in the First In - Last Out principle.
 * This implementation of a Stack contains the following methods: <br>
 * {@link #pop()}
 * {@link #push(Object)}
 * {@link #peek()}
 * {@link #numOfElems()}
 * {@link #isEmpty()}
 *
 * and a static method {@link #create()} to create an instance of {@link MyStackDLLBImpl}
 * */
public interface MyStack<E> {

    /**
     * Popping the element of the Stack means removing its last element
     * and returning its value.
     *
     * @return the last element of the Stack
     * @see MyStackDLLBImpl#pop()
     * */
    E pop();

    /**
     * Pushing an element in a Stack means adding it at the last place.
     *
     * @param x The element to add at the last place
     * @see MyStackDLLBImpl#push(Object) 
     * */
    void push(E x);

    /**
     * Checks if the Stack is empty or not
     * @return true if the list is empty, false otherwise
     * */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * Counts the number of elements in the Stack
     * @return the number of elements in the Stack
     * @see MyStackDLLBImpl#numOfElems()
     * */
    int numOfElems();

    /**
     * Peek retrieves the value of the last element of the list but does not remove it
     *
     * @return the value of the last element of the Queue
     * @see MyStackDLLBImpl#peek()
     * */
    E peek();

    /**
     * Consider pros and cons of having a factory method in the interface
     * */
    static <T> MyStackDLLBImpl<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
