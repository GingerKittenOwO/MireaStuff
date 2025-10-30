package ru.mirea.lab12.Ex1;
import javax.swing.*;
import java.awt.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeRenderer extends JPanel {
    private List<Shape> shapes = new ArrayList<>();

    public ShapeRenderer(){
        for (int i =0; i<20;i++){
            shapes.add(createRandomShape());
        }
    }
    private Shape createRandomShape(){
        Random random = new Random();

        Color randomColor = new Color(
                random.nextInt(0,255),
                random.nextInt(0,255),
                random.nextInt(0,255)
        );
        int x = random.nextInt(400);
        int y = random.nextInt(400);
        int shapeType = random.nextInt(2);
        switch(shapeType){
            case 0: return new Circle(randomColor, x, y, random.nextInt(30));
            case 1: return new Rectangle(randomColor, x, y, random.nextInt(30),random.nextInt(30));
            default: return null;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Очищаем фон

        // Передаем "кисть" каждой фигуре
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
