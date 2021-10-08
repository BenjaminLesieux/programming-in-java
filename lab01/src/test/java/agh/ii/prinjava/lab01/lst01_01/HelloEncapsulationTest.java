package agh.ii.prinjava.lab01.lst01_01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloEncapsulationTest {

    @BeforeEach
    void setUp() {
        System.out.println("HelloEncapsulationTest.setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("HelloEncapsulationTest.tearDown");
    }

    @Test
    void checkSameValue() {
        HelloEncapsulation en = new HelloEncapsulation(12);

        int value = en.getPropVal();
        value = 13;

        assertEquals(value == en.getPropVal(), false);
    }

    @Test
    void checkChangedClassValue() {
        HelloEncapsulation en = new HelloEncapsulation(12);

        int value = en.getPropVal();
        en.setPropVal(14);

        assertEquals(value == en.getPropVal(), false);
    }

    @Test
    void checkChangedValue() {
        HelloEncapsulation en = new HelloEncapsulation(12);

        int value = en.getPropVal();
        value = 14;
        en.setPropVal(value);

        assertEquals(value == en.getPropVal(), true);
    }
}