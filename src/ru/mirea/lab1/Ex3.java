package ru.mirea.lab1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        int[] arr = new int[10];
        int summa = 0;
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<10;i++){
            arr[i]=sc.nextInt();
            summa+=arr[i];
        }
        System.out.println("Среднее значение: "+summa/10);
    }
}
