package ru.mirea.task4;

public class BallTest {
    public static void main(String[] args)
    {
        Ball bl = new Ball(50, 52);
        System.out.println(bl);
        bl.move(30, 15);
        System.out.println(bl);
    }
}
