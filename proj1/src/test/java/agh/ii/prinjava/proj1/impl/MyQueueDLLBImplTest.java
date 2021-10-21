package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

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

    @Test
    void dequeue() {
        assertEquals(1, queueOfInts.dequeue());
        assertEquals(2, queueOfInts.dequeue());
        assertEquals(3, queueOfInts.dequeue());
        assertThrows(IllegalStateException.class, queueOfInts::dequeue);
    }

    @Test
    void numOfElems() {
        assertEquals(3, queueOfInts.numOfElems());
        queueOfInts.dequeue();
        queueOfInts.dequeue();
        assertEquals(1, queueOfInts.numOfElems());
    }

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