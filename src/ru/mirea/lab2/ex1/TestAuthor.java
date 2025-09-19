package ru.mirea.lab2.ex1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        String email;
        Author ath = new Author("Ivan","vasilev.i.i1@edu.mirea.ru",'m');
        System.out.println(ath);
        System.out.println(ath.getEmail());
        System.out.println(ath.getGender());
        System.out.println(ath.getName());
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите новый email: ");
        email = sc.nextLine();
        ath.setEmail(email);
        System.out.println(ath.getEmail());
    }

}
