package agh.ii.prinjava.lab04.exc04_02.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {

    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
        dLinkList.addFirst(3);
        dLinkList.addLast(23);
        dLinkList.addLast(234);
        dLinkList.addLast(23344);
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void addFirst() {
        Random random = new Random();

        for (int i = 0; i < Math.abs(random.nextInt(100)); i++) {
            int n = random.nextInt();
            dLinkList.addFirst(n);
            assertEquals(n, dLinkList.seek(0));
        }
    }

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

    @Test
    void addLast() {
        Random random = new Random();

        for (int i = 0; i < Math.abs(random.nextInt(100)); i++) {
            int n = random.nextInt();
            dLinkList.addLast(n);
            assertEquals(n, dLinkList.seek(dLinkList.getSize()-1));
        }
    }

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
    }

    @Test
    void seek() {
        assertEquals(3, dLinkList.seek(0));
        assertEquals(23, dLinkList.seek(1));
        assertEquals(234, dLinkList.seek(2));
        assertEquals(23344, dLinkList.seek(3));

        assertThrows(IllegalStateException.class, () -> dLinkList.seek(12));
    }

    @Test
    void getSize() {
        assertEquals(4, dLinkList.getSize());
        dLinkList.removeFirst();
        dLinkList.removeLast();
        assertEquals(2, dLinkList.getSize());
    }
}