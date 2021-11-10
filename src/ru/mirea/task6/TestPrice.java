package ru.mirea.task6;

public class TestPrice {
    public static void main(String[] args) {

        Telephone telephone=new Telephone("33000");
        Laptop laptop=new Laptop("55000");
        Tablet tablet=new Tablet ("18000");
        telephone.getPrice();
        laptop.getPrice();
        tablet.getPrice();
    }
}
