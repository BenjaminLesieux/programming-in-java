package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Simple test class reviewing all the methods of {@link MyStack}
 * */
class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    /**
     * Called before each test
     **/
    @BeforeEach
    void setUp() {
        stackOfInts.push(2);
        stackOfInts.push(3);
        stackOfInts.push(4);
    }

    /**
     * Called after each test
     * */
    @AfterEach
    void tearDown() {
    }

    /**
     * This test adds a random number (between 0 and 100) of random ints
     * that we push in the Stack. Then we {@link org.junit.jupiter.api.Assertions#assertEquals}
     * the result given by {@link MyStack#pop()} <br><br>
     *
     * We then remove all the remaining elements and check if they return the expected result <br><br>
     *
     * Finally, we try to remove an element when the stack is empty and we check with
     * {@link org.junit.jupiter.api.Assertions#assertThrows(Class, Executable)} if
     * an error is thrown
     * */
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

    /**
     * This test adds a random number (between 0 and 100) of random ints
     * that we push in the Stack. Then we {@link org.junit.jupiter.api.Assertions#assertEquals}
     * the result given by {@link MyStack#peek()} 
     * */
    @Test
    void push() {
        Random random = new Random();

        for (int i = 0; i < Math.abs(random.nextInt(100)); i++) {
            int n = random.nextInt();
            stackOfInts.push(n);
            assertEquals(n, stackOfInts.peek());
        }
    }

    /**
     * We {@link org.junit.jupiter.api.Assertions#assertEquals(int, int)} the actual size of 3 
     * with the {@link MyStack#numOfElems()} then we {@link MyStack#push(Object)}
     * */
    @Test
    void numOfElems() {
        assertEquals(3, stackOfInts.numOfElems());
        stackOfInts.push(1);
        stackOfInts.push(2);
        assertEquals(5, stackOfInts.numOfElems());
    }

    /**
     * This test adds a random number (between 0 and 100) of random ints
     * that we push in the Stack. Then we {@link org.junit.jupiter.api.Assertions#assertEquals}
     * the result given by {@link MyStack#peek()} and then we {@link MyStack#pop()} the element
     * */
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