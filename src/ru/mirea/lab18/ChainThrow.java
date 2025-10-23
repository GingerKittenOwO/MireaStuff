package ru.mirea.lab18;


import java.util.Scanner;

public class ThrowingDemo {
    public void getKey() {
        try {
            Scanner myScanner = new Scanner(System.in);
            String key = myScanner.next();
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public void printDetails(String key) throws Exception {
            String message = getDetails(key);
            System.out.println(message);

    }

    private String getDetails(String key) throws Exception {
        if (key.equals("#")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }



    public static void main(String[] args) {
        ThrowingDemo td = new ThrowingDemo();
        td.getKey();
    }
}