package agh.ii.prinjava.lab01.lst01_08;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sun.misc.Unsafe;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UnsafeSingletonTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkInstance() {
        UnsafeSingleton unsafeSingleton = UnsafeSingleton.getInstance();
        UnsafeSingleton unsafeSingleton1 = UnsafeSingleton.getInstance();

        assertEquals(unsafeSingleton == unsafeSingleton1, true);
    }

    @Test
    void multipleThreads() {

        List<UnsafeSingleton> singletons = new ArrayList<>();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                singletons.add(UnsafeSingleton.getInstance());
            }
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                singletons.add(UnsafeSingleton.getInstance());
            }
        };

        runnable.run();
        runnable1.run();
    }
}