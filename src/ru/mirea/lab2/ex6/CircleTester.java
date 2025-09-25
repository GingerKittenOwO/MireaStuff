package ru.mirea.lab2.ex6;

public class CircleTester {
    public static void main(String[] args) {
        Circle c1 = new Circle(3,4,5);
        Circle c2 = new Circle(5,2,7);
        c1.compareTo(c2);
        System.out.println(c1.circumference());
        System.out.println(c1.area());
        c1.setX(7);
        System.out.println(c1);
    }
}
