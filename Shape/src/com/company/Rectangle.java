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
     double getArea() {
         return length * width;
     }

     @Override
     double getPerimeter() {
         return (2 * length)+ (2 * width);
     }

     @Override
     Point2D.Double getCenter() {
         // formula is (x/2, y/2)
         double x = (double)this.width/2 + this.bottomRight.getX();
         double y = (double)this.length/2 + this.bottomRight.getY();
        
         return new Point2D.Double(x,y);
     }

    /* @Override
     boolean inShape() {
         return false;
     }*/
 }
