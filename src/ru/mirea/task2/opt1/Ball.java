package ru.mirea.task2.opt1;

public class Ball {
    int r;
    final double P=3.14;

    public Ball (int r)
    {
        this.r = r;
    }

    public int getR()
    {
        return r;
    }

    public void setR(int r)
    {
        this.r = r;
    }

    public double getArea()
    {
        return r*r*P*4;
    }

    @Override
    public String toString() {
        return "r=" + r +" Area= "+ getArea();
    }
}
