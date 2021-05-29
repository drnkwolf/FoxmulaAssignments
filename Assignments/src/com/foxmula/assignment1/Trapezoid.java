package com.foxmula.assignment1;

public class Trapezoid extends Quadrilateral {
    private double height;

    public Trapezoid(CartesianCoordinate p1, CartesianCoordinate p2, CartesianCoordinate p3, CartesianCoordinate p4, double height) {
        super(p1, p2, p3, p4);
        this.height = height;
    }

    public double Area(){
        double base = super.LengthOfTheSide();
        double area = base * this.height;

        return area;
    }
}
