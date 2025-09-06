package ru.mirea.lab1;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();

        System.out.println(factorial(a));
    }
    public static int factorial(int num){
        int ans = 1;
        for(int i=1;i<=num;i++){
            ans*=i;
        }
        return ans;


//        if(num==1){
//            return num;
//        }
//        else{
//            return num*factorial(num-1);
//        }
    }
}
