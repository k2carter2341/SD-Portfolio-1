package com.company;
import  java.awt.*;

import javax.sound.sampled.SourceDataLine;


public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.getArea();
        System.out.println("The area is " + circle1.getArea());
        circle1.getPerimeter();
        System.out.println("The perimeter is " +circle1.getPerimeter());
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
    /*abstract double getEuclidean();
    abstract boolean inShape();*/
}