package ru.mirea.lab12.Ex1;

import javax.swing.*;

public class ShapeDemo {
    public static void main(String[] args) {
        // Создаем и настраиваем окно
        JFrame frame = new JFrame("test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        // Добавляем наш панель с фигурами
        ShapeRenderer drawingPanel = new ShapeRenderer();
        frame.add(drawingPanel);

        // Показываем окно
        frame.setVisible(true);
    }
}
