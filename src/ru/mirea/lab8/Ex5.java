package ru.mirea.lab8;

import java.util.Scanner;

public class Ex5 {
    public static int sum_numerals(int n){
        int i = 1;
        if (n>10){
            return n % 10 + sum_numerals(n/10);
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(sum_numerals(a));
    }
}

