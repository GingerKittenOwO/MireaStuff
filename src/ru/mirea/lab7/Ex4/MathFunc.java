package ru.mirea.lab7.Ex4;

import static java.lang.Math.sqrt;

public class MathFunc implements MathCalculable{


    @Override
    public double power(double a, int n) {
        if(n<0) return -1;
        else if(n==0) return 1;
        else {
            double res =1;
            for (int i = 0; i < n; i++) res *= a;
            return res;
        }
    }

    @Override
    public double complexModule(double a, double b) {
        return sqrt(a*a+b*b);
    }
    public double circumference(double r){
        return 2* PI * r;
    }
}
