package com.company;

import java.awt.*;
import java.awt.geom.Point2D;

public class Circle extends Shapes{
    private final double radius;
    private final Point2D point;

    public  Circle () {
        this.radius =1;
        this.point = new Point2D.Double(0.1, 0.1);
    }

    public Circle(double radius, Point2D point) {
        this.radius = radius;
        this.point = point;
    }




    @Override
    double getArea() {
        //Area= 2*pi*r^2
        return 2* Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        //Circumference= 2*pi*r
        return 2* Math.PI * radius;
    }

    @Override
    double getEuclidean() {
        // get formula for distance between two points
        return 0; //public double distance(Point2D point);
    }

    @Override
    boolean inShape() {
        return false;
    }
}
