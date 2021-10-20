package agh.ii.prinjava.lab03.exc03_01.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListBasedImplTest {

    // Create an empty queue
    private final QueueOfInts queueOfInts = QueueOfIntsFtry.create(QueueOfIntsFtry.Impln.L_LIST_B);

    private static final String demoFileName = "objects.ser";

    private static void deleteDemoFile() {
        try {
            Files.deleteIfExists(Path.of(demoFileName));
            System.out.println("\nDemo file deleted");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @BeforeEach
    void setUp() {
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(4);

        System.out.println(queueOfInts);
    }

    @AfterEach
    void tearDown() {
        deleteDemoFile();
    }

    @Test
    void newQueueIsEmpty() {
        //assertTrue(queueOfInts.isEmpty());
    }

    @Test
    void enqueue() {
        queueOfInts.enqueue(178);
        queueOfInts.dequeue();
        queueOfInts.dequeue();
        queueOfInts.dequeue();
        assertEquals(178, queueOfInts.dequeue());
    }

    @Test
    void dequeue() {
        assertEquals(1, queueOfInts.dequeue());
        assertNotEquals(3, queueOfInts.dequeue());
        assertEquals(4, queueOfInts.dequeue());

        assertThrows(IllegalStateException.class, queueOfInts::dequeue);
    }

    @Test
    void numOfElems() {
    }

    @Test
    void peek() {
        assertEquals(1, queueOfInts.peek());
        queueOfInts.dequeue();
        assertEquals(2, queueOfInts.peek());
    }

    @Test
    void serialized() {
        try (var fout = new ObjectOutputStream(Files.newOutputStream(Path.of(demoFileName)));
             var in = new ObjectInputStream(Files.newInputStream(Path.of(demoFileName)))) {

            var sObj = queueOfInts;
            System.out.println("Queue of ints (unserialized): " + sObj);
            fout.writeObject(sObj);
            System.out.println("Queue of ints has just been serialized. Now trying to deserialize it...");
            var dsObj = (LinkedListBasedImpl) in.readObject();
            System.out.println("Queue of ints (deserialized object): " + dsObj);

            // if both return the same thing then the deserialization must have worked
            assertEquals(sObj.toString(), dsObj.toString());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("demo2: IOException | ClassNotFoundException");
            e.printStackTrace();
        }
    }
}
