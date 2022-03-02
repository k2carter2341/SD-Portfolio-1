package com.company;
//import java.awt.*;
import java.awt.geom.Point2D;

public class Circle extends Shapes{
    private final double radius;
    private final Point2D.Double center;

    public  Circle () {
        this.radius =5;
        this.center = new Point2D.Double(1.0, 1.0);
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
        return   Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        //Circumference= 2*pi*r
        return 2* Math.PI * radius;
    }

   /* @Override
    boolean inShape() {
        return false;
    }*/

}
