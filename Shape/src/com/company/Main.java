package com.company;
import  java.awt.*;


public class Main {

    public void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.getArea();
        System.out.println("The area is " + circle1.getArea());
    }
}

abstract class Shapes {
    abstract double getArea();
    abstract double getPerimeter();
    abstract double getEuclidean();
    abstract boolean inShape();
}