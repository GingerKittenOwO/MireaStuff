package ru.mirea.lab8;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Ex7 {
    public static String simple_num(int n, int del){
        if (del>sqrt(n)+1) {System.out.println(n); return"";}
        else if (n%del==0) System.out.println(del);

        return simple_num(n,del+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        simple_num(a,1);
    }
}
