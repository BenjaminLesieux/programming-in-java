package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void addFirstAndCheckRemovedValue() {
        dLinkList.addFirst(17);

        System.out.println(dLinkList);
        dLinkList.addFirst(44);

        System.out.println(dLinkList);

        assertEquals(44, dLinkList.removeFirst());
        assertEquals(17, dLinkList.removeFirst());
        assertEquals(3, dLinkList.removeFirst());
        assertEquals(23, dLinkList.removeFirst());
        assertEquals(234, dLinkList.removeFirst());
        assertEquals(23344, dLinkList.removeFirst());
        assertThrows(IllegalStateException.class, dLinkList::removeFirst);
    }

    @Test
    void addLastAndCheckRemovedValue() {
        dLinkList.addLast(17);
        System.out.println(dLinkList);
        dLinkList.addLast(44);
        System.out.println(dLinkList);

        assertEquals(44, dLinkList.removeLast());
        assertEquals(17, dLinkList.removeLast());
        assertEquals(23344, dLinkList.removeLast());
        assertEquals(234, dLinkList.removeLast());
        assertEquals(23, dLinkList.removeLast());
        assertEquals(3, dLinkList.removeLast());
       //assertThrows(IllegalStateException.class, dLinkList::removeLast);
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