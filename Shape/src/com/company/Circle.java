package com.company;
import java.awt.geom.Point2D;

public class Circle extends Shapes{
    private final double radius;
    private final Point2D.Double center;

    //commented out this default constructor because the other shapes dont have one
    // public Circle () {
    //     this.radius = 1;
    //     this.center = new Point2D.Double();
    // }

    public Circle(double r, Point2D.Double c ) {
        this.radius = r;
        this.center = c;
    }

    @Override
    public Point2D.Double getCenter() {
       return this.center;
       
    }

    @Override
    public double getArea() {
        //Area = 2*pi*r^2
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        //Circumference = 2*pi*r
        return 2 * Math.PI * this.radius;
    }

    //code for inShape inspired by https://www.geeksforgeeks.org/find-if-a-point-lies-inside-or-on-circle/
    public boolean inShape(Point2D.Double point) {
        if((point.getX())-(this.center.getX()) * 
        (point.getX())-(this.center.getX()) +
        (point.getY())-(this.center.getY()) *
        (point.getY())-(this.center.getY()) <=
        this.radius * this.radius) 
            return true;
        else 
            return false;
    }
}


