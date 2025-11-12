package ru.mirea.lab20;

public class Calculator {
    public static<N1 extends Number,N2 extends Number> Number sum(N1 num1, N2 num2){
        return num1.doubleValue() + num2.doubleValue();
    }
    public static<N1 extends Number,N2 extends Number> Number multiply(N1 num1, N2 num2){
        return num1.doubleValue() * num2.doubleValue();
    }
    public static<N1 extends Number,N2 extends Number> Number divide(N1 num1, N2 num2){
        if (num2.doubleValue()==0) throw new ArithmeticException("Деление на ноль");
        return num1.doubleValue() / num2.doubleValue();
    }
    public static<N1 extends Number,N2 extends Number> Number subtruction(N1 num1, N2 num2){
        return num1.doubleValue() - num2.doubleValue();
    }

    public static void main(String[] args) {
        int a =45;
        float b = 23.5f;
        System.out.println(sum(a,b));
        System.out.println(multiply(a,b));
        System.out.println(subtruction(a,b));
        System.out.println(divide(a,b));
    }
}
