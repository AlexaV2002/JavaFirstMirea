package ru.mirea.task7;

public class ExecutorMoveRectangle {
    public static void main(String[] args)
    {
        MovablRectangle mr = new MovablRectangle(1,5, 4, 0,2,2);
        System.out.println(mr);
        mr.moveLeft();
        mr.moveLeft();
        mr.moveUp();
        mr.moveLeft();
        mr.moveUp();
        System.out.println(mr);
        mr.topLeft.ySpeed = 1;
        mr.moveUp();
        System.out.println(mr);
    }
}
