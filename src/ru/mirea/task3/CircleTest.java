package ru.mirea.task3;

import java.util.Locale;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.print("Input radius: ");
        double radius = scan.nextDouble();

        Circle circle = new Circle(radius);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Length: " + circle.getLength());

    }
}
