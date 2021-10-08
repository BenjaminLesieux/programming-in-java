package agh.ii.prinjava.lab01.lst01_08;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EagerSingletonTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkInstance() {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();

        assertEquals(eagerSingleton == eagerSingleton1, true);
    }
}