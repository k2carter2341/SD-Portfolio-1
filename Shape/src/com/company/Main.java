package com.company;
import  java.awt.*;
import java.awt.geom.Point2D;

import javax.sound.sampled.SourceDataLine;


public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.getArea();
        System.out.println("The area is " + circle1.getArea());
        circle1.getPerimeter();
        System.out.println("The perimeter is " +circle1.getPerimeter());
        Point2D.Double p = new Point2D.Double(4.0, 4.0);
        Circle circle2 = new Circle(3.0, p);
        System.out.println("The area of circle 2 is " + circle2.getArea() );
        System.out.println("The perimeter of circle 2 is " + circle2.getPerimeter());
        //System.out.println("The distance between circle 1 and cirlce 2 is " + getEuclidean() );
        

    }
}

abstract class Shapes {
    double area, perimeter;
    /*public double Shapes(){   So the code runs with this constructor but not sure if the abstract class should be here?
        return getArea();
        return getPerimeter();
    }*/
    abstract double getArea(){
        return area;
    }
    abstract double getPerimeter(){
        return perimeter;
    }
    //abstract double getEuclidean();
    /*abstract boolean inShape();*/
}