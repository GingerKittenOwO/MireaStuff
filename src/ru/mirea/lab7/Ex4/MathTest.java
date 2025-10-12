package ru.mirea.lab7.Ex4;

public class MathTest {
    public static void main(String[] args) {
        MathCalculable calc = new MathFunc();
        System.out.println(calc.complexModule(3,4));
        System.out.println(calc.power(3,3));


        MathFunc fc = new MathFunc();
        System.out.println(fc.circumference(5));
    }
}
