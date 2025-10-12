package ru.mirea.lab7.Ex1_3;

public class MovablePoint implements Movable{
    private double x;
    private double y;
    private double xSpeed;
    private double ySpeed;

    public MovablePoint(double x, double y, double xSpeed, double ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getxSpeed() {
        return xSpeed;
    }

    public double getySpeed() {
        return ySpeed;
    }

    public void moveUp(double dist){
        y+=dist;
    }
    public void moveDown(double dist){
        y-=dist;
    }
    public void moveLeft(double dist){
        x-=dist;
    }
    public void moveRight(double dist){
        x+=dist;
    }

    @Override
    public String toString() {
        return "MovablePoint(" + x + ", " + y + ")";
    }
}
