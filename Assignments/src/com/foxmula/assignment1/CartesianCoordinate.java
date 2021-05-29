package com.foxmula.assignment1;

public class CartesianCoordinate {
    private double x, y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public CartesianCoordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public CartesianCoordinate(){
        this(0, 0);
    }
}
