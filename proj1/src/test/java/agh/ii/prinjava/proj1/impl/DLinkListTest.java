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
 * Simple test class reviewing all the methods of {@link DLinkList}
 * */
class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    /**
     * Called before each test
     **/
    @BeforeEach
    void setUp() {
        dLinkList.addFirst(3);
        dLinkList.addLast(23);
        dLinkList.addLast(234);
        dLinkList.addLast(23344);
    }

    /**
     * Called after each test
     * */
    @AfterEach
    void tearDown() {
    }


    /**
     * This test adds a random number (between 0 and 100) of random ints
     * that we add at the first place of the DLL. Then we {@link org.junit.jupiter.api.Assertions#assertEquals}
     * the result given by {@link DLinkList#seek(int)}
     * */
    @Test
    void addFirst() {
        Random random = new Random();

        for (int i = 0; i < Math.abs(random.nextInt(100)); i++) {
            int n = random.nextInt();
            dLinkList.addFirst(n);
            assertEquals(n, dLinkList.seek(0));
        }
    }

    /**
     * This test adds a random number (between 0 and 100) of random ints
     * that we push in the Stack. Then we {@link org.junit.jupiter.api.Assertions#assertEquals}
     * the result given by {@link DLinkList#removeFirst()} <br><br>
     *
     * We then remove all the remaining elements and check if they return the expected result <br><br>
     *
     * Finally, we try to remove an element when the list is empty and we check with
     * {@link org.junit.jupiter.api.Assertions#assertThrows(Class, Executable)} if
     * an error is thrown
     * */
    @Test
    void removeFirst() {
        Random random = new Random();

        for (int i = 0; i < Math.abs(random.nextInt(100)); i++) {
            int n = random.nextInt();
            dLinkList.addFirst(n);
            assertEquals(n, dLinkList.removeFirst());
        }

        assertEquals(3, dLinkList.removeFirst());
        assertEquals(23, dLinkList.removeFirst());
        assertEquals(234, dLinkList.removeFirst());
        assertEquals(23344, dLinkList.removeFirst());
        assertThrows(IllegalStateException.class, dLinkList::removeFirst);
    }

    /**
     * This test adds a random number (between 0 and 100) of random ints
     * that we add at the last place of the DLL. Then we {@link org.junit.jupiter.api.Assertions#assertEquals}
     * the result given by {@link DLinkList#seek(int)}
     * */
    @Test
    void addLast() {
        Random random = new Random();

        for (int i = 0; i < Math.abs(random.nextInt(100)); i++) {
            int n = random.nextInt();
            dLinkList.addLast(n);
            assertEquals(n, dLinkList.seek(dLinkList.getSize()-1));
        }
    }

    /**
     * This test adds a random number (between 0 and 100) of random ints
     * that we push in the Stack. Then we {@link org.junit.jupiter.api.Assertions#assertEquals}
     * the result given by {@link DLinkList#removeLast()} <br><br>
     *
     * We then remove all the remaining elements and check if they return the expected result <br><br>
     *
     * Finally, we try to remove an element when the list is empty and we check with
     * {@link org.junit.jupiter.api.Assertions#assertThrows(Class, Executable)} if
     * an error is thrown
     * */
    @Test
    void removeLast() {
        Random random = new Random();

        for (int i = 0; i < Math.abs(random.nextInt(100)); i++) {
            int n = random.nextInt();
            dLinkList.addLast(n);
            assertEquals(n, dLinkList.removeLast());
        }

        assertEquals(23344, dLinkList.removeLast());
        assertEquals(234, dLinkList.removeLast());
        assertEquals(23, dLinkList.removeLast());
        assertEquals(3, dLinkList.removeLast());
        assertThrows(IllegalStateException.class, dLinkList::removeLast);
    }

    /**
     * This test adds a random number (between 0 and 100) of random ints
     * that we push in the Stack. Then we {@link org.junit.jupiter.api.Assertions#assertEquals}
     * the result given by {@link DLinkList#seek(int)} for all the indexes in the list
     *
     * <br> <br>
     *
     * Then we check with {@link org.junit.jupiter.api.Assertions#assertThrows(Class, Executable)} if
     * an error is thrown when the index if over the size of the list
     * */
    @Test
    void seek() {
        assertEquals(3, dLinkList.seek(0));
        assertEquals(23, dLinkList.seek(1));
        assertEquals(234, dLinkList.seek(2));
        assertEquals(23344, dLinkList.seek(3));

        assertThrows(IllegalStateException.class, () -> dLinkList.seek(12));
    }

    /**
     * We {@link org.junit.jupiter.api.Assertions#assertEquals(int, int)} the actual size of 4
     * with the {@link DLinkList#getSize()} then we remove 2 elements and check if the new size
     * is actually 2
     * */
    @Test
    void getSize() {
        assertEquals(4, dLinkList.getSize());
        dLinkList.removeFirst();
        dLinkList.removeLast();
        assertEquals(2, dLinkList.getSize());
    }
}