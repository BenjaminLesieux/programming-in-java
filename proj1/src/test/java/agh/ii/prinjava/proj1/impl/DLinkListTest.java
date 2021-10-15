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
    void removeElement() {

    }
}