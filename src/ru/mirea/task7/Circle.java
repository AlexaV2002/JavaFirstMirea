package ru.mirea.task7;

public class Circle extends Shape
{
    private final double P=3.1416;
    protected double radius;

    public Circle(){}

    public Circle (double radius)
    {
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return radius*radius*P;
    }

    @Override
    public double getPerimeter()
    {
        return 2*P*radius;
    }

    @Override
    public String toString() {
        return "Area= "+ (radius*radius*P) +
                ", Perimeter= " + (2*P*radius) +
                ", color= " + color +
                ", filled= " + filled ;
    }
}
