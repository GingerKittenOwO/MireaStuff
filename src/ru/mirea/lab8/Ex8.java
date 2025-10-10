package ru.mirea.lab8;

import java.util.Scanner;

public class Ex8 {
    public static String palindrom(String line, int i){
        if (i > line.length()/2) return "YES";
        else if (line.charAt(i)==line.charAt(line.length()-i-1)) return palindrom(line,i+1);
        else return "NO";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(palindrom(input,0));

    }
}
