package ru.mirea.lab2;

public class Tester_Circles {
    private Circle[] arr;
    private int length;
    public Tester_Circles(Circle[] arr, int length){
        this.arr = arr;
        this.length = length;
    }
    public void spitout(){
        System.out.println("Объекты кругов по индексам:");
        for (int i = 0;i<length;i++){
            System.out.printf("[%d] - %s\n",i,arr[i]);
        }
    }
    @Override
    public String toString(){
        return "Сейчас в массиве "+length+" объектов";
    }
    public static void main(String[] args) {

        Point p1 = new Point(6,3);
        Point p2 = new Point(3,7);
        Point p3 = new Point(2,-3);
        Circle c1 = new Circle(p1,5);
        Circle c2 = new Circle(p2,7);
        Circle c3 = new Circle(p3,3);
        System.out.println(c1);
        Circle[] arr = new Circle[]{c1,c2,c3};
        Tester_Circles kek = new Tester_Circles(arr,3);
        System.out.println(kek);
        kek.spitout();

    }
}
