package ru.mirea.task12.ex3;

import java.util.Scanner;

public class Runner {

    public static void MergeSort(Students[] s, int first, int end)
    {
        if (end <= first) return;
        int mid = (first+end)/2;
        MergeSort(s, first, mid);
        MergeSort(s, mid+1, end);

        Students left[] = new Students[mid - first + 1];
        Students right[] = new Students[end - mid];
        int leftIndex = 0;
        int rightIndex = 0;


        for (int i = 0; i < left.length; i++)
            left[i] = s[first + i];
        for (int i = 0; i < right.length; i++)
            right[i] = s[mid + i + 1];


        for (int i = first; i < end + 1; i++) {
            if (leftIndex < left.length && rightIndex < right.length) {
                if (left[leftIndex].id < right[rightIndex].id) {
                    s[i] = left[leftIndex];
                    leftIndex++;
                } else {
                    s[i] = right[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < left.length) {
                s[i] = left[leftIndex];
                leftIndex++;
            } else if (rightIndex < right.length) {
                s[i] = right[rightIndex];
                rightIndex++;
            }
        }
    }
    public static void main(String[] args) {
        int i;
        Students[] s1 = new Students[3];
        Students[] s2 = new Students[3];
        Students[] s = new Students[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первый список 3 id студентов");
        for (i=0; i<3; i++)
        {
            s1[i] = new Students();
            s1[i].id = sc.nextInt();
        }
        System.out.println("Введите второй список 3 id студентов");
        for (i=0; i<3; i++)
        {
            s2[i] = new Students();
            s2[i].id = sc.nextInt();
        }
        System.out.println("Новый массив: ");
        i=0;
        for (int j=0; j<6; j++)
        {
            s[j] = new Students();
            s[j] = s1[i];
            i++;
            if (j == 2)
            {
                s1 = s2;
                i=0;
            }
            System.out.println(s[j].id);
        }
        MergeSort(s, 0, 5);
        System.out.println("Новый отсортированный массив: ");
        for (int j=0; j<6; j++)
        {
            System.out.println(s[j].id);
        }
    }
}