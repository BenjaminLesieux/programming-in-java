package agh.ii.prinjava.lab01.lst01_02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class RichDadTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkEncapsulation() {
        List<String> list1 = List.of("Nico", "Ben");
        List<String> list2 = new ArrayList<String>();

        list2.add("Nico");
        list2.add("Ben");

        list1.add("Diego");
        list2.add("Diego");
    }
}