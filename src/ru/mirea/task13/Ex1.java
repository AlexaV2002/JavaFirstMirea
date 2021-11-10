package ru.mirea.task13;
import java.util.ArrayList;
public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> catNames = new ArrayList<String>();
        catNames.add("Васька");
        catNames.add("Мурзик");
        catNames.add("Барсик");
        catNames.add("Леопольд");
        System.out.printf("В списке %d элементов \n", catNames.size());
        System.out.println(catNames);

        System.out.println("Вывод 3 элемента списка: ");
        System.out.println(catNames.get(2));

        catNames.set(2, "Барсик");
        System.out.println("Замена 3 элемента:");
        System.out.println(catNames + " ");

        System.out.println("Вывод индекса элемента <Барсик>:");
        System.out.println(catNames.indexOf("Барсик"));

        catNames.remove(2);
        System.out.println("Удаление элемента 3:");
        System.out.println(catNames + " ");
    }
}


