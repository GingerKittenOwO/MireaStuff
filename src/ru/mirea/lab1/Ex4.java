package ru.mirea.lab1;

import java.util.Scanner;
import java.lang.Math.*;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = 0;
        System.out.println("Введите количество чисел:");
        size = sc.nextInt();
        int[] arr = new int[size];
        int summa = 0;
        int minimum = 0;
        int maximum = 0;
        int i =0;
        while (i<size){
            arr[i]=sc.nextInt();
            if (i==0){
                minimum = arr[i];
            }
            summa += arr[i];
            minimum = min(minimum,arr[i]);
            maximum = max(maximum,arr[i]);
            i++;
        }
        System.out.println("Сумма чисел: " + summa);
        System.out.println("инимальное число: " + minimum);
        System.out.println("Максимально число: " + maximum);

    }
}
