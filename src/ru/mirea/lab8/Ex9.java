package ru.mirea.lab8;

import java.util.Scanner;

public class Ex9 {
    public static int ohneZweiNullen(int a_0, int b_1){
        if(a_0>=2+b_1) return 0;
        else if (a_0==0 || b_1==0) return 1;
        //else if (a_0==1) return b_1;
        else return ohneZweiNullen(a_0,b_1-1) + ohneZweiNullen(a_0-1,b_1-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(ohneZweiNullen(a,b));
    }
}
