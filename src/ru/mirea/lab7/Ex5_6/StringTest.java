package ru.mirea.lab7.Ex5_6;

public class StringTest {
    public static void main(String[] args) {
        StringMod str = new ProcessStrings();
        System.out.println(str.countSyl("Hello world!"));
        System.out.println(str.oddSyl("Hello world!"));
        System.out.println(str.invert("Hello world!"));

    }
}
