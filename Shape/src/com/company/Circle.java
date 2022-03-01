package com.company;

import java.awt.*;

public class Circle extends Shapes{
    private final double radius;
    private Point point;

    public Circle(double radius, Point point) {
        this.radius = radius;
        this.point = point;
    }

    public  Circle () {
        this(1);
    }

    /*public Circle(double radius) {
        this.radius = radius;
    }*/

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
        return 0;
    }

    @Override
    boolean inShape() {
        return false;
    }
}
