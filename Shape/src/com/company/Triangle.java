package com.company;
import java.awt.geom.Point2D;

public class Triangle extends Shapes{
    private Point2D.Double p1;
    private Point2D.Double p2;
    private Point2D.Double p3;
    
    // double sideP1P2 = Math.sqrt(Math.pow((this.p2.getX() - this.p1.getX()),2) + Math.pow((this.p2.getY() - this.p1.getY()),2));
    // double sideP2P3 = Math.sqrt(Math.pow((this.p3.getX() - this.p2.getX()),2) + Math.pow((this.p3.getY() - this.p2.getY()),2));
    // double sideP1P3 = Math.sqrt(Math.pow((this.p1.getX() - this.p3.getX()),2) + Math.pow((this.p1.getY() - this.p3.getY()),2));
    /*private final double side1;
    private final double side2;
    private final double side3;*/

   /* public  Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }*/
    
    public Triangle(Point2D.Double p1, Point2D.Double p2, Point2D.Double p3){ 
        // this.p1 = new Point2D.Double p1;
        // this.p2 = new Point2D.Double p2;
        // this.p3 = new Point2D.Double p3;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    //With this constructor there are only three doubles, but we need an x and y component for a point

    @Override
    Point2D.Double getCenter() {
        //final Point2D.Double centroid = new Point2D.Double((p1.getX() + p2.getX() + p3.getX()) / 3.0, (p1.getY() + p2.getY() + p3.getY()) / 3.0);
        double x = (this.p1.getX()+this.p2.getX()+this.p3.getX())/3;
        double y = (this.p1.getY()+this.p2.getY()+this.p3.getY())/3;
        return new Point2D.Double(x,y);
    }
    // Prints out "The center of the triangle is Point2D[x,y]" the y is correct but not the x.
    //The very simple thignt to remember is pemdas and parentheses.
    @Override
    double getPerimeter() {
        //Use distance formula to find lengths: sqrt((x2 − x1)^2 + (y2 − y1)^2) 
        // with each length, find perimeter: perimeter = sideP1P2 + sideP2P3+ sideP1P3
        double sideP1P2 = Math.sqrt(Math.pow((this.p2.getX() - this.p1.getX()),2) + Math.pow((this.p2.getY() - this.p1.getY()),2));
        double sideP2P3 = Math.sqrt(Math.pow((this.p3.getX() - this.p2.getX()),2) + Math.pow((this.p3.getY() - this.p2.getY()),2));
        double sideP1P3 = Math.sqrt(Math.pow((this.p1.getX() - this.p3.getX()),2) + Math.pow((this.p1.getY() - this.p3.getY()),2));
        return sideP1P2 + sideP2P3 + sideP1P3;
    }
    @Override
    double getArea() {
        // Using Heron's formula = SquareRoot(s * (s - a) * (s - b) * (s - c))
        // s = (a + b + c)/2
        double sideP1P2 = Math.sqrt(Math.pow((this.p2.getX() - this.p1.getX()),2) + Math.pow((this.p2.getY() - this.p1.getY()),2));
        double sideP2P3 = Math.sqrt(Math.pow((this.p3.getX() - this.p2.getX()),2) + Math.pow((this.p3.getY() - this.p2.getY()),2));
        double sideP1P3 = Math.sqrt(Math.pow((this.p1.getX() - this.p3.getX()),2) + Math.pow((this.p1.getY() - this.p3.getY()),2));
        double s = (sideP1P2 + sideP2P3 + sideP1P3) / 2;
        // System.out.println(sideP1P2);
        // System.out.println(sideP2P3);
        // System.out.println(sideP1P3);
        return Math.sqrt(s * (s - sideP1P2) * (s - sideP2P3) * (s - sideP1P3));
        }

  
    //https://www.geeksforgeeks.org/check-whether-a-given-point-lies-inside-a-triangle-or-not/?ref=rp

    private double area(Point2D.Double pA, Point2D.Double pB, Point2D.Double pC) {
        return Math.abs((pA.getX()*(pB.getY()-pC.getY()))+(pB.getX()*(pC.getY()-pA.getY()))+(pC.getX()*(pA.getY()-pB.getY()))/2.0);
    }

    @Override
    boolean inShape(Point2D.Double point) {
        double area0 = area(this.p1, this.p2, this.p3);
        double area1 = area(this.p1, this.p2, point);
        double area2 = area(point, this.p2, this.p3);
        double area3 = area(this.p1, point, this.p3);
        return (area0 == area1+area2+area3);
    }
}
