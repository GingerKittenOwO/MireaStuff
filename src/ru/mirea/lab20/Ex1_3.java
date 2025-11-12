package ru.mirea.lab20;

import java.io.Serializable;

class Animal{}

class Dog extends Animal implements Serializable{
    @Override
    public String toString() {
        return "Dog{}";
    }
}


public class Ex1_3<T extends Comparable<T>,V extends Animal & Serializable,K> {
    private T content1;
    private V content2;
    private K content3;
    public Ex1_3(T content1, V content2, K content3){
        this.content1 = content1;
        this.content2 = content2;
        this.content3 = content3;
    }

    public T getContent1() {
        return content1;
    }

    public void setContent1(T content1) {
        this.content1 = content1;
    }

    public V getContent2() {
        return content2;
    }

    public void setContent2(V content2) {
        this.content2 = content2;
    }

    public K getContent3() {
        return content3;
    }

    public void setContent3(K content3) {
        this.content3 = content3;
    }

    @Override
    public String toString(){
        return "Переменные:\n"
                +content1 + " (" + content1.getClass() + ")\n"
                +content2 + " (" + content2.getClass() + ")\n"
                +content3 + " (" + content3.getClass() + ")\n";
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Ex1_3<Integer,Dog,String> test = new Ex1_3<Integer,Dog,String>(123, dog, "Hello");
        System.out.println(test);
    }
}
