package ru.mirea.lab1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = 0;
        System.out.println("Введите количество чисел:");
        size = sc.nextInt();
        int[] arr = new int[size];
        int summa = 0;

        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            summa+=arr[i];
        }
        System.out.println("Среднее значение: "+ (float)summa/size);
    }
}
