package ru.mirea.task3;

public class HumanTest {
    public static void main(String[] args) {
        Human h = new Human(12, 0.7, 0.6);
        System.out.println(h);
        h.h.DoThink();
        h.g.getWalk();
        h.ha.PullWithUhand();
    }
}
