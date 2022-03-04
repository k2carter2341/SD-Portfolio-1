 package com.company;
 import java.awt.geom.Point2D;


 public class Rectangle extends Shapes{
     private final double length;
     private final double width;
     private final Point2D.Double bottomRight;   //need to rename because we are solving for the center but need a refernec point from the rectangle


     public Rectangle (double width, double length, Point2D.Double bottomRight){
         this.length = length;
         this.width = width;
         this.bottomRight = bottomRight;
     }

     @Override
     public double getArea() {
         return length * width;
     }

     @Override
     public double getPerimeter() {
         return (2 * length)+ (2 * width);
     }

     @Override
     public Point2D.Double getCenter() {
         // formula is (x/2, y/2)
         double x = this.width/2 + this.bottomRight.getX();
         double y = this.length/2 + this.bottomRight.getY();
        
         return new Point2D.Double(x,y);
     }

     //code taken from https://www.geeksforgeeks.org/check-whether-a-given-point-lies-on-or-inside-the-rectangle-set-3/?ref=rp
     public boolean inShape(Point2D.Double point) {
        if (point.getX()-point.getY()-this.width <= 0 &&
        point.getX()-point.getY()+this.width >= 0 &&
        point.getX()+point.getY()-2*this.length+this.width <= 0 &&
        point.getX()+point.getY()-this.width >= 0)
            return true;
        else
            return false;
     }

 }


