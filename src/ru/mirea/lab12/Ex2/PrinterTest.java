package ru.mirea.lab12.Ex2;

import javax.swing.*;
import java.util.Scanner;

public class PrinterTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Scanner sc = new Scanner(System.in);


        String path = sc.next();


        // Добавляем наш панель с фигурами
        PicturePrinter printer = new PicturePrinter(path);

        frame.setSize(printer.getImg().getWidth(), printer.getImg().getHeight()+40);
        frame.add(printer);

        // Показываем окно
        frame.setVisible(true);
    }
}
