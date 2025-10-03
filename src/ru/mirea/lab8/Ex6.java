package ru.mirea.lab8;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Ex6 {
    public static String simple_num(int n, int del){
        if (del>sqrt(n)+1) return("YES");
        else if (n%del==0) return("NO");

        return simple_num(n,del+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(simple_num(a,2));
    }
}
