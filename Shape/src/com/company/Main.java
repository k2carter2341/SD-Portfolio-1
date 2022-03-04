package com.company;
import java.awt.geom.Point2D;

public class Main {

    public static void main(String[] args) {

        //Check if Circle class works
        Circle circle1 = new Circle(3.0, new Point2D.Double());
        System.out.println("The center of circle 1 is " + circle1.getCenter());
        System.out.println("The area of circle 1 is " + circle1.getArea());
        System.out.println("The perimeter of circle 1 is " + circle1.getPerimeter());
        Circle circle2 = new Circle(3.0, new Point2D.Double(0.0, 4.0));
        System.out.println("The distance between the centers of circle 1 and circle 2 is " + circle1.getEuclidean(circle2));
        Point2D.Double outofshape = new Point2D.Double(10.0, 0.0);
        if (circle1.inShape(outofshape))
            System.out.println("Inside");
        else
            System.out.println("Outside");

        //Check if Rectangle class works
        Rectangle rectangle1 = new Rectangle(2.0, 4.0, new Point2D.Double(0,0));
        Rectangle rectangle2 = new Rectangle (2.0, 4.0, new Point2D.Double(0, 5));
        System.out.println("The center of rectangle 1 is " + rectangle1.getCenter());
        System.out.println("The area of rectangle 1 is " + rectangle1.getArea());
        System.out.println("The perimenter of rectangle 1 is " + rectangle1.getPerimeter());
        System.out.println("The distance between the centers of rectangle 1 and 2 is " + rectangle1.getEuclidean(rectangle2));
        Point2D.Double randompoint = new Point2D.Double(10.0, 10.0);
        if (rectangle1.inShape(randompoint))
            System.out.println("Inside");
        else
            System.out.println("Outside");

        //Check if Triangle class works
        Triangle triangle1 = new Triangle(new Point2D.Double(0.0, 0.0), new Point2D.Double(20.0, 0.0), new Point2D.Double(10.0, 30.0));
        System.out.println("The center of the triangle is " + triangle1.getCenter());
        System.out.println("The area of the triangle is " + triangle1.getArea());
        System.out.println("The perimeter of the triangle is " + triangle1.getPerimeter());
        Triangle triangle2 = new Triangle(new Point2D.Double(1.0, 1.0), new Point2D.Double(3.0, 0.0), new Point2D.Double(10.0, 3.0));
        System.out.println("The distance between the centers of triangles 1 and 2 is " + triangle1.getEuclidean(triangle2));
        if (triangle1.inShape(new Point2D.Double(35.0, 35.0)))
            System.out.println("Inside");
        else
            System.out.println("Outside");

        //check if getEuclidean works between diff shapes
        System.out.println("The distance between the centers of circle 1 and triangle 2 is " + circle1.getEuclidean(triangle2));
        System.out.println("The distance between the centers of triangle 1 and rectangle 2 is " + triangle1.getEuclidean(rectangle2));
        System.out.println("The distance between the centers of rectangle 1 and circle 2 is " + rectangle1.getEuclidean(circle2));
    }
}

abstract class Shapes {
    abstract double getArea();

    abstract double getPerimeter();

    abstract Point2D.Double getCenter();

    abstract boolean inShape(Point2D.Double point); 

    public double getEuclidean(Shapes shape){
        return this.getCenter().distance(shape.getCenter());
    }
}
