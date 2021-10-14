package ru.mirea.task10;
import java.util.Scanner;

public class Var5 {
    // Сумма цифр числа
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Задание 5");
        System.out.print("Введите число: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Сумма цифр числа " + n + ": " + sum_digits(n));

    }

    public static int sum_digits(int n) {
        if (n / 10 == 0)
            return n;

        return n % 10 + sum_digits(n / 10);
    }
}

