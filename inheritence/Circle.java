package com.pondit.inheritence;

public class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
        this.radius = 1.0;
        this.color = "Red";
    }

    public double getArea() {

        return radius * radius * Math.PI;
    }
}

