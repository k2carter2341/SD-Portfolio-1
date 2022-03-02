package com.company;
import java.awt.geom.Point2D;

public class Triangle extends Shapes{
    final Point2D.Double p1;
    final Point2D.Double p2;
    final Point2D.Double p3;
    /*private final double side1;
    private final double side2;
    private final double side3;*/
    
    public Triangle(Point2D.Double p1, Point2D.Double p2, Point2D.Double p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    Point2D.Double getCenter() {
        //final Point2D.Double centroid = new Point2D.Double((p1.getX() + p2.getX() + p3.getX()) / 3.0, (p1.getY() + p2.getY() + p3.getY()) / 3.0);
        double x = (double)this.p1.getX()+this.p2.getX()+this.p3.getX()/3;
        double y = (double)this.p1.getY()+this.p2.getY()+this.p3.getY()/3;
        return new Point2D.Double(x,y);
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
    }

    

    /*@Override
    boolean inShape() {
        return false;
    }*/
}
