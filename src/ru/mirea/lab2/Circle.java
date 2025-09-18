package ru.mirea.lab2;
import java.lang.*;
public class Circle {
    private Point center;
    private int r;
    public Circle(Point center,int r){
        this.center = center;
        this.r = Math.abs(r);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = Math.abs(r);
    }
    public double circumference(){
        return 2*Math.PI*r;
    }
    public double area(){
        return Math.PI * Math.pow(r,2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Center[" + center +
                "], r=" + r +
                '}';
    }
}
