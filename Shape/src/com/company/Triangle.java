<<<<<<< Updated upstream
package com.company;


public class Triangle extends Shapes{
    double ab, bc, ca; //sides
    Point2D a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(Point2D ab, Point2D bc, Point2D ca) {
        this.ab = ab;
        this.bc = bc;
        this.ca = ca;
    }

    





    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimeter() {
        return 0;
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
=======
// package com.company;

// public class Triangle extends Shapes{
//    /* private double sideA;
//     private double sideB;
//     private double sideC;
//     private double height;*/

//     @Override
//     double getArea() {
//         return 0;
//     }

//     @Override
//     double getPerimeter() {
//         return 0;
//     }

//     @Override
//     double getEuclidean() {
//         return 0;
//     }

//     @Override
//     boolean inShape() {
//         return false;
//     }
// }
>>>>>>> Stashed changes
