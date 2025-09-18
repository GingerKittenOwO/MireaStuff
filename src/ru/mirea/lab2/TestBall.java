package ru.mirea.lab2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        ball.setX(3);
        ball.setY(4);
        System.out.println(ball);
        ball.setXY(5,6);
        System.out.println(ball);
        ball.move(4,-3);
        System.out.println(ball);
    }

}
