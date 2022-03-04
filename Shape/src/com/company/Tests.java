package com.company;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.awt.geom.Point2D;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    @Test
    public void testCircle() {
        Double r = 3.0;
        Circle circ1 = new Circle(r, new Point2D.Double());
        Circle circ2 = new Circle(r, new Point2D.Double(0.0,5.0));
        Point2D.Double randompoint1 = new Point2D.Double(10.0, 10.0); //won't be inside shape
        Point2D.Double randompoint2 = new Point2D.Double(1.0, 1.0); //will be inside shape

        assertEquals(circ1.getArea(), 28.27, 0.01); //we know with a radius of 3, the result will be 27.28...

        assertEquals(circ1.getPerimeter(), 18.85, 0.01);

        assertEquals(circ1.getCenter().distance(circ2.getCenter()), 5);
        //We test this formula instead of getEuclidean because we can't directly test getEuclidean

        Assertions.assertFalse(circ1.inShape(randompoint1));
        Assertions.assertTrue(circ2.inShape((randompoint2)));
        //Testing if we are both in and out of the circle
    }

    @Test
    public void testRectangle(){
        Rectangle rect1 = new Rectangle (2.0, 4.0, new Point2D.Double(0, 0));
        Rectangle rect2 = new Rectangle (2.0, 4.0, new Point2D.Double(0, 5));
        Point2D.Double randompoint1 = new Point2D.Double(10.0, 10.0); //won't be inside shape
        Point2D.Double randompoint2 = new Point2D.Double(1.0, 1.0); //will be inside shape

        assertEquals(rect1.getArea(), 8);

        assertEquals(rect1.getPerimeter(), 12);

        assertEquals(rect1.getCenter().distance(rect2.getCenter()), 5);
        //We test this formula instead of getEuclidean because we can't directly test getEuclidean

        Assertions.assertFalse(rect1.inShape(randompoint1));
        Assertions.assertTrue(rect1.inShape((randompoint2)));
        //Testing if we are both in and out of the rectangle
    }

    @Test
    public void testTriangle(){
        Triangle tri1 = new Triangle( new Point2D.Double(0.0, 0.0), new Point2D.Double(2.0, 0.0), new Point2D.Double(1.0, 1.0));
        Triangle tri2 = new Triangle( new Point2D.Double(2.0, 0.0), new Point2D.Double(4.0, 0.0), new Point2D.Double(3.0, 1.0));
        Point2D.Double randompoint1 = new Point2D.Double(10.0, 10.0); //won't be inside shape
        Point2D.Double randompoint2 = new Point2D.Double(0.5, 0.5); //will be inside shape

        assertEquals(tri1.getArea(), 1, 0.01);

        assertEquals(tri1.getPerimeter(), 4.82, 0.01);

        assertEquals(tri1.getEuclidean(tri2), 2);
        //We test this formula instead of getEuclidean because we can't directly test getEuclidean

        Assertions.assertFalse(tri1.inShape(randompoint1));
        Assertions.assertTrue(tri1.inShape(randompoint2));
        //Testing if we are both in and out of the triangle
    }
}
