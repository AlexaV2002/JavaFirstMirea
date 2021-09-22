package ru.mirea.task1.opt3.task3;

public class Circle {
    private double diameter;
    private double radius;

    public Circle (double radius) {
        this.diameter = 2 * radius;
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }

    public double getLength() {
        return diameter * 3.14;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        return "Circle diameter = " + diameter +
                ", radius = " + radius;
    }
}
