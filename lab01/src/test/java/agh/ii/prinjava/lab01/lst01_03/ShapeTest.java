package agh.ii.prinjava.lab01.lst01_03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void area() {

        Shape circleShape = new Circle(12.0, true);
        Circle circleShape2 = new Circle(12.0, true);
        Shape rectangleShape = new Rectangle(12.0, 12.0, true);

        List<Shape> shapes = List.of(circleShape, circleShape2, rectangleShape);

        assertEquals(circleShape.area() == circleShape2.area(), true);
    }
}