package ru.mirea.task2;

public class DogTest {
    public static void main(String[] args)
    {
        Dog[] d = new Dog[3];
        d[0] = new Dog("Billie", 2);
        d[1] = new Dog("Bim", 7);
        d[2] = new Dog("Rex");
        d[2].setAge(3);
        System.out.println(d[0]);
        d[0].intoHumanAge();
        d[1].intoHumanAge();
        d[2].intoHumanAge();
    }
}
