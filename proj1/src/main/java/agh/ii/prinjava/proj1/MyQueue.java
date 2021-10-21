package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.DLinkList;
import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/**
 * A queue works with the First in - First out principle.
 * This Queue consists of the basic methods:
 * {@link #enqueue(Object)}
 * {@link #dequeue()}
 * {@link #peek()}
 * {@link #numOfElems()}
 * {@link #isEmpty()}
 *
 * and a static method {@link #create()} that creates an implementation of a Queue with {@link MyQueueDLLBImpl}
 * */
public interface MyQueue<E> {

    /**
     * Enqueuing an element into a Queue means adding it at the last place. This is in respect to the
     * First in - First out principle.
     *
     * @param x The element to add at the end
     * @see MyQueueDLLBImpl#enqueue(Object)
     * */
    void enqueue(E x);

    /**
     * Dequeuing an element means removing the first element of the queue and returning its value.
     *
     * @return The first element of the Queue
     * @see MyQueueDLLBImpl#dequeue()
     * */
    E dequeue();

    /**
     * @return true if the list is empty, false otherwise
     * */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * @return The number of elements in the Queue
     * @see MyQueueDLLBImpl#numOfElems()
     * */
    int numOfElems();

    /**
     * Retrieves the value of the first element of the Queue but does not remove it.
     *
     * @return The value of the first element of the Queue
     * @see MyQueueDLLBImpl#peek()
     * */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<T>();
    }
}
