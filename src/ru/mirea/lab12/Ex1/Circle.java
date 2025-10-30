package ru.mirea.lab12.Ex1;

import java.awt.*;

public class Circle extends Shape{
    int r;

    public Circle(Color color, int x, int y, int radius){
        super(color, x, y);
        this.r = radius;
    }
    @Override
    public void draw(Graphics g) {
        g.setColor(color);          // Выбираем цвет кисти
        g.fillOval(x, y, r*2, r*2); // Рисуем залитый oval
    }

}
