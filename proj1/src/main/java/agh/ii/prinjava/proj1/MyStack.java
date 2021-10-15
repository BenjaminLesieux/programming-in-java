package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

public interface MyStack<E> {
    E pop();

    void push(E x);

    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    int numOfElems();

    E peek();

    /** Consider pros and cons of having a factory method in the interface
     * @return
     * */
    static <T> MyStackDLLBImpl<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
