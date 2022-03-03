package com.company;
//import  java.awt.*;
import java.awt.geom.Point2D;


public class Main {

    public static void main(String[] args) {

        /*Circle circle1 = new Circle(3.0, new Point2D.Double());
        circle1.getArea();
        System.out.println("The area is " + circle1.getArea());
        circle1.getPerimeter();
        System.out.println("The perimeter is " +circle1.getPerimeter());
        Point2D.Double p = new Point2D.Double(0.0, 4.0);
        Circle circle2 = new Circle(3.0, p);
        System.out.println("The area of circle 2 is " + circle2.getArea() );
        System.out.println("The perimeter of circle 2 is " + circle2.getPerimeter());
        System.out.println("The distance between circle 1 and cirlce 2 is " + circle1.getEuclidean(circle2));*/


        /*Rectangle rectangle1 = new Rectangle(2.0, 4.0, new Point2D.Double(0,0));
        Rectangle rectangle2 = new Rectangle (2.0, 4.0, new Point2D.Double(0, 5));
        System.out.println("The are is " + rectangle1.getArea());
        System.out.println("The perimenter is " + rectangle1.getPerimeter());
        System.out.println("The area of the second rectangle is " + rectangle2.getArea());
        System.out.println("The perimeter of the second rectangle is " + rectangle2.getPerimeter());
        System.out.println("The distance between rectangle 1 and 2 is " + rectangle1.getEuclidean(rectangle2));*/

        /*Triangle triangle1 = new Triangle(5.0, 3.0, 4.0);
        System.out.println("The perimeter of the triangle is " + triangle1.getPerimeter());
        System.out.println("The area of the traingle is " + triangle1.getArea()); //with heron's forumla the issue of an imaginary number appears. I've looked this up and StackOverflow had something about determining if the points of the triangle are colinear. */

        Triangle triangle1 = new Triangle( new Point2D.Double(1.0, 2.0), new Point2D.Double(3.0, -4.0), new Point2D.Double(-4.0, 5.0));
        System.out.println("The center of the triangle is " + triangle1.getCenter());
        System.out.println("The perimeter of the triangle is " + triangle1.getPerimeter());
    }
}

abstract class Shapes {
    double area, perimeter;
    /*public double Shapes(){   So the code runs with this constructor but not sure if the abstract class should be here?
        return getArea();
        return getPerimeter();
    }*/
    /*abstract double getArea();
        //return area;*/
    
    abstract double getPerimeter();
        //return perimeter;*/

    abstract Point2D.Double getCenter();
        //return center;
    //abstract boolean inShape();

    public double getEuclidean(Shapes shape){
        return this.getCenter().distance(shape.getCenter());
    }
}
