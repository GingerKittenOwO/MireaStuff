package ru.mirea.lab8;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Ex7 {
    public static String multipliers(int n, int del){
        if (n==1) { return"";}
        else if (n%del==0){
            System.out.println(del);
            return multipliers(n/del,del);}
        else return multipliers(n,del+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        multipliers(a,2);
    }
}
