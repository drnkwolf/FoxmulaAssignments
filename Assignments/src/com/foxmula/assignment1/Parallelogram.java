package com.foxmula.assignment1;

public class Parallelogram extends Quadrilateral {
    private double height;

    public Parallelogram(CartesianCoordinate p1, CartesianCoordinate p2, CartesianCoordinate p3, CartesianCoordinate p4, double height) {
        super(p1, p2, p3, p4);
        this.height = height;
    }

    public double area(){
        double base = super.lengthOfTheSide();
        double area = base * this.height;

        return area;
    }
}
