package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void enqueueAndDequeueCheck() {
        assertEquals(1, queueOfInts.dequeue());
        assertEquals(2, queueOfInts.dequeue());
        assertEquals(3, queueOfInts.dequeue());
        assertThrows(IllegalStateException.class, queueOfInts::dequeue);
    }

    @Test
    void seekAndCheckValue() {
        assertEquals(1, queueOfInts.peek());
        assertNotEquals(2, queueOfInts.peek());
        queueOfInts.dequeue();
        assertEquals(2, queueOfInts.peek());
    }
}