package com.codewithharry.shape;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getLength(); // Since it's a square, length and width are the same
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }
}
