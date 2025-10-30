package ru.mirea.lab12.Ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class PicturePrinter extends JPanel {
    private BufferedImage img;
    //private ImageObserver imgObs;
    public PicturePrinter(String path){
        try {
            this.img = ImageIO.read(new File(path));
//            this.imgObs = new ImageObserver() {
//                @Override
//                public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
//                    return false;
//                }
//            };
        } catch (IOException e) {
            System.out.println("Problem is: " + e); // если проблема с файлом картинки
        }
    }

    public BufferedImage getImg() {
        return img;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Очищаем фон
        g.drawImage(img,0,0,this);

    }

}
