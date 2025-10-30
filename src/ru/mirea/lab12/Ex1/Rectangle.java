package ru.mirea.lab12.Ex1;

import java.awt.*;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(Color color, int x, int y, int weidth, int height){
        super(color, x, y);
        this.width=weidth;
        this.height=height;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);  // Рисуем залитый прямоугольник
    }
}
