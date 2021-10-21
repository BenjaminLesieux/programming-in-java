package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
        stackOfInts.push(2);
        stackOfInts.push(3);
        stackOfInts.push(4);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pop() {

        Random random = new Random();

        for (int i = 0; i < Math.abs(random.nextInt(100)); i++) {
            int n = random.nextInt();
            stackOfInts.push(n);
            assertEquals(n, stackOfInts.pop());
        }

        assertEquals(4, stackOfInts.pop());
        assertEquals(3, stackOfInts.pop());
        assertNotEquals(3, stackOfInts.pop());
        assertThrows(IllegalStateException.class, stackOfInts::pop);
    }

    @Test
    void push() {
        Random random = new Random();

        for (int i = 0; i < Math.abs(random.nextInt(100)); i++) {
            int n = random.nextInt();
            stackOfInts.push(n);
            assertEquals(n, stackOfInts.peek());
        }
    }

    @Test
    void numOfElems() {
        assertEquals(3, stackOfInts.numOfElems());
        stackOfInts.push(1);
        stackOfInts.push(2);
        assertEquals(5, stackOfInts.numOfElems());
    }

    @Test
    void peek() {
        Random random = new Random();

        for (int i = 0; i < Math.abs(random.nextInt(100)); i++) {
            int n = random.nextInt();
            stackOfInts.push(n);
            assertEquals(n, stackOfInts.peek());
            stackOfInts.pop();
        }
    }
}