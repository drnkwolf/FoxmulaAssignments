package com.foxmula.assignment1;

public class Quadrilateral {
    private CartesianCoordinate p1, p2, p3, p4;

    public Quadrilateral(CartesianCoordinate p1, CartesianCoordinate p2, CartesianCoordinate p3, CartesianCoordinate p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public double lengthOfTheSide(){
        double length = Math.sqrt(((this.p1.getX() - this.p2.getX()) * (this.p1.getX() - this.p2.getX())) + ((this.p1.getY() - this.p2.getY()) * (this.p1.getY() - this.p2.getY())));

        return length;
    }
}
