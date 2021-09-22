package ru.mirea.task3;

public class Hand {
    double length;

    public Hand(double length) {
        this.length = length;
    }

    public void getSick() {
        System.out.println("leg is sick");
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void PullWithUhand() {
        System.out.println("Pull with your hand");
    }

    @Override
    public String toString() {
        return "length hand=" + length;
    }
}
