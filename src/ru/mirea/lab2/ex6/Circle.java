package ru.mirea.lab2.ex6;




public class Circle {
    private double x;
    private double y;
    private double r;
    public Circle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double circumference(){
        return  2*Math.PI*r;
    }
    public double area(){
        return Math.PI * r * r;
    }
    public void compareTo(Circle c){
        if (this.r < c.r) System.out.printf("Радиус этой окружности меньше на %f \n",c.r - this.r);
        else if(this.r == c.r) System.out.println("Радиусы равны");
        else System.out.printf("Радиус этой окружности больше на %f \n",this.r-c.r);

        System.out.printf("Координаты центров окружностей: (%f %f)   (%f %f) \n",this.x,this.y,c.x,c.y);
        System.out.printf("Отношение длин окружностей этой к сравниваемой: %f \n",this.r/c.r);
        System.out.printf("Отношение площадей окружностей этой к сравниваемой: %f \n",(this.r * this.r)/(c.r*c.r));

    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}
