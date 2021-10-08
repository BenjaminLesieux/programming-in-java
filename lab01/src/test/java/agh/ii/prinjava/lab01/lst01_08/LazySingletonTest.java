package agh.ii.prinjava.lab01.lst01_08;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LazySingletonTest {

    @BeforeEach
    void setUp() {
        System.out.println("LazySingletonTest.setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("LazySingletonTest.tearDown");
    }

    @Test
    void checkInstance() {
        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();

        assertEquals(instance == instance2, true);
    }
}