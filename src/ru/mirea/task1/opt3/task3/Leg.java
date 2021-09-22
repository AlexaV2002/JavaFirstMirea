package ru.mirea.task1.opt3.task3;

public class Leg {
    double length;

    public Leg (double length)
    {
        this.length = length;
    }

    public void getWalk()
    {
        System.out.println("leg is walk");
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public double getLength()
    {
        return length;
    }

    @Override
    public String toString() {
        return "length leg=" + length+ " ";
    }
}
