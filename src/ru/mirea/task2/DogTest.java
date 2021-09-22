package ru.mirea.task2;

public class DogTest {
    public static void main(String[] args)
    {
        Dog d1 = new Dog("Bim", 8);
        Dog d2 = new Dog("Amur", 7);
        Dog d3 = new Dog("Dog");
        d3.setAge(5);
        System.out.println();
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
