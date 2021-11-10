package ru.mirea.task13;

import java.util.LinkedList;

public class Ex2 {
    public static void main(String[] args) {
        String cat1 = "Барсик ";
        String cat2 = "Мурзик";
        String cat3 = "Васька";
        String cat4 = "Леопольд";

        LinkedList<String> cats = new LinkedList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        System.out.println("Вывод элементов:");
        System.out.println(cats);

        System.out.println("Добавление элемента между первым и вторым элементом");
        cats.add(1, "Толстопуз");
        System.out.println(cats);

        System.out.println("Удаление последнего элемента");
        cats.pollLast();
        System.out.println(cats);

        System.out.println("Добавление элемента в конец списка");
        cats.addLast("Матроскин");
        System.out.println(cats);

        System.out.println("Возвращение массива элементов");
        String[] car = cats.toArray(new String[4]);
        for (int i=0; i<4; i++)
            System.out.println(car[i]);
    }
}