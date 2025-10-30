package ru.mirea.lab12.Ex3;

import javax.swing.*;

public class AnimationTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sprite Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Предположим, у нас спрайт-лист 4x2 кадра, каждый 64x64 пикселя
        AnimationPanel animation = new AnimationPanel(
                "src/images/Conksprites.png",  // путь к спрайт-листу
                68, 50,        // размер одного кадра
                8              // всего кадров в анимации
        );

        frame.add(animation);
        frame.setVisible(true);
    }
}
