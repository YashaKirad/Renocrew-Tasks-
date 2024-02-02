package com.codewithharry.shape;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return calculateArea() * height;
    }

    public double calculateSurfaceArea() {
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }
}
