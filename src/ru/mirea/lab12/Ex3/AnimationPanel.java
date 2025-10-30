package ru.mirea.lab12.Ex3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.Timer;

public class AnimationPanel extends JPanel {
    private BufferedImage spriteSheet;
    private int currentFrame = 0;
    private int totalFrames;
    private int frameWidth, frameHeight;
    private Timer timer;

    public AnimationPanel(String spritePath, int frameWidth, int frameHeight, int totalFrames) {
        try {
            this.spriteSheet = ImageIO.read(new File(spritePath));
            this.frameWidth = frameWidth;
            this.frameHeight = frameHeight;
            this.totalFrames = totalFrames;

            // Таймер для смены кадров (каждые 100 мс)
            timer = new Timer(100, e -> {
                currentFrame = (currentFrame + 1) % totalFrames;
                repaint(); // Перерисовываем панель
            });
            timer.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (spriteSheet != null) {
            // Вычисляем координаты текущего кадра на спрайт-листе
            int srcX = (currentFrame % (spriteSheet.getWidth() / frameWidth)) * frameWidth;
            int srcY = 0;

            // Рисуем только один кадр
            g.drawImage(spriteSheet,
                    50, 50, 50 + frameWidth, 50 + frameHeight,  // куда рисовать
                    srcX, srcY, srcX + frameWidth, srcY + frameHeight,  // откуда брать
                    this);
        }
    }
}
