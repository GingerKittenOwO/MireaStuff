package ru.mirea.lab7.Ex1_3;

public class MovableTest {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(2,6,1,2);
        MovablePoint p2 = new MovablePoint(4,1,1,2);
        MovableRectangle rc = new MovableRectangle(p1,p2);
        System.out.println(rc);
        rc.moveUp(3);
        System.out.println(rc);
        System.out.println(rc.speedTest());
    }
}
