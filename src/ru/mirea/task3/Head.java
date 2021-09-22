package ru.mirea.task3;

public class Head {
    private static final double P = 3.14 ;
    int r;

    public Head (int r)
    {
        this.r = r;
    }

    public void DoThink()
    {
        System.out.println("I think...");
    }

    public void setR(int r)
    {
        this.r = r;
    }

    public int getR()
    {
        return r;
    }

    public double getArea()
    {
        return P*r*r;
    }

    @Override
    public String toString() {
        return "Area= " + getArea()+ " ";
    }
}
