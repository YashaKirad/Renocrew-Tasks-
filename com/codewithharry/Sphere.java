package com.codewithharry.shape;

public class Sphere extends Circle {
    public Sphere(double radius) {
        super(radius);
    }

    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }

    public double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(getRadius(), 2);
    }
}
