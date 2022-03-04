package com.company;
//import java.awt.*;
import java.awt.geom.Point2D;

public class Circle extends Shapes{
    private final double radius;
    private final Point2D.Double center;

    public  Circle () {
        this.radius =3;
        this.center = new Point2D.Double(0.0, 0.0);
    }

    public Circle(double r, Point2D.Double c ) {
        this.radius = r;
        this.center = c;
    }

    @Override
    Point2D.Double getCenter() {
       return this.center;
       
   }

    @Override
    double getArea() {
        //Area= 2*pi*r^2
        return   Math.PI * radius * radius; //not this.radius?
    }

    @Override
    double getPerimeter() {
        //Circumference= 2*pi*r
        return 2* Math.PI * radius;
    }

    //boolean isInside(int circle_x, int circle_y, int rad, int x, int y)
    // Compare radius of circle with distance of its center from given point
    //code taken from https://www.geeksforgeeks.org/find-if-a-point-lies-inside-or-on-circle/
    boolean inShape(Point2D.Double point) {
        if((point.getX())-(this.center.getX()) * 
        (point.getX())-(this.center.getX()) +
        (point.getY())-(this.center.getY()) *
        (point.getY())-(this.center.getY()) <=
        this.radius * this.radius) 
            return true;
        else 
            return false;
    }
// if ((x - circle_x) * (x - circle_x) +
// (y - circle_y) * (y - circle_y) <= rad * rad)
// return true;
// else
// return false;


}


