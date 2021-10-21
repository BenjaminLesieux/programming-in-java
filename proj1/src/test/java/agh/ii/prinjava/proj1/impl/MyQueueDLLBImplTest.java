package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Simple test class reviewing all the methods of {@link MyQueue}
 * */
class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    /**
     * Called before each test
     * */
    @BeforeEach
    void setUp() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
    }

    /**
     * Called after each test
     * */
    @AfterEach
    void tearDown() {
    }

    /**
     * This test adds a random number (between 0 and 100) of random ints
     * that we push in the Queue. Then we {@link org.junit.jupiter.api.Assertions#assertEquals}
     * the result given by {@link MyQueue#enqueue(Object)}
     * */
    @Test
    void enqueue() {
        Random random = new Random();

        assertEquals(1, queueOfInts.dequeue());
        assertEquals(2, queueOfInts.dequeue());
        assertEquals(3, queueOfInts.dequeue());

        for (int i = 0; i < Math.abs(random.nextInt(100)); i++) {
            int n = random.nextInt();
            queueOfInts.enqueue(n);
            assertEquals(n, queueOfInts.dequeue());
        }
    }

    /**
     * This test removes all the remaining elements and check if they return the expected result <br><br>
     *
     * Then we add a random number (between 0 and 100) of random ints
     * that we <br> {@link MyQueue#enqueue(Object)} in the Queue. Then we {@link org.junit.jupiter.api.Assertions#assertEquals}
     * the result given by {@link MyQueue#dequeue()} <br><br>
     *
     * Finally, we try to dequeue an element when the queue is empty and we check with
     * {@link org.junit.jupiter.api.Assertions#assertThrows(Class, Executable)} if
     * an error is thrown
     * */
    @Test
    void dequeue() {

        Random random = new Random();

        assertEquals(1, queueOfInts.dequeue());
        assertEquals(2, queueOfInts.dequeue());
        assertEquals(3, queueOfInts.dequeue());

        for (int i = 0; i < Math.abs(random.nextInt(100)); i++) {
            int n = random.nextInt();
            queueOfInts.enqueue(n);
            assertEquals(n, queueOfInts.dequeue());
        }

        assertThrows(IllegalStateException.class, queueOfInts::dequeue);
    }

    /**
     * We {@link org.junit.jupiter.api.Assertions#assertEquals(int, int)} the actual size of 3 
     * with the {@link MyQueue#numOfElems()} then we {@link MyQueue#enqueue(Object)} (Object)}
     * */
    @Test
    void numOfElems() {
        assertEquals(3, queueOfInts.numOfElems());
        queueOfInts.dequeue();
        queueOfInts.dequeue();
        assertEquals(1, queueOfInts.numOfElems());
    }

    /**
     * This test adds a random number (between 0 and 100) of random ints
     * that we push in the Stack. Then we {@link org.junit.jupiter.api.Assertions#assertEquals}
     * the result given by {@link MyQueue#peek()} and then we {@link MyQueue#dequeue()} the element
     * */
    @Test
    void peek() {
        Random random = new Random();

        assertEquals(1, queueOfInts.peek());
        queueOfInts.dequeue();
        assertEquals(2, queueOfInts.peek());
        queueOfInts.dequeue();
        assertEquals(3, queueOfInts.peek());
        queueOfInts.dequeue();

        for (int i = 0; i < Math.abs(random.nextInt(100)); i++) {
            int n = random.nextInt();
            queueOfInts.enqueue(n);
            assertEquals(n, queueOfInts.peek());
            queueOfInts.dequeue();
        }
    }
}