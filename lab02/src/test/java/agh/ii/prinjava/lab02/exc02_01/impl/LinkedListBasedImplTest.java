package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListBasedImplTest {

    // Create an empty stack
    private final StackOfInts stackOfInts = StackOfIntsFtry.create(StackOfIntsFtry.Impln.ARRAY_B);

    @BeforeEach
    void setUp() {
        stackOfInts.push(12);
        stackOfInts.push(22);
        stackOfInts.push(1);
        stackOfInts.push(111);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pop() {
        assertEquals(111, stackOfInts.pop());
        assertEquals(1, stackOfInts.pop());
        assertNotEquals(11, stackOfInts.pop());
        assertEquals(12, stackOfInts.pop());

        assertThrows(IllegalStateException.class, stackOfInts::pop);
    }

    @Test
    void push() {
        Random random = new Random();

        for (int i = 0; i < random.nextInt(); i++) {
            int next = random.nextInt() + 1;

            System.out.println(next);

            stackOfInts.push(next);
            assertEquals(next, stackOfInts.pop());
        }
    }

    @Test
    void numOfElems() {
        assertEquals(4, stackOfInts.numOfElems());
        stackOfInts.pop();
        assertEquals(3, stackOfInts.numOfElems());
    }

    @Test
    void peek() {
        assertEquals(12, stackOfInts.peek());
    }
}