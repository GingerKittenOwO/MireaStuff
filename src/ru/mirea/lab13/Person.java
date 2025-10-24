package ru.mirea.lab13;

public class Person {
    private String name = "";
    private String sureName = "";
    private String fatherName = "";

    public Person(String sureName) {
        this.sureName = sureName;
    }

    public Person(String sureName, String name) {
        this.name = name;
        this.sureName = sureName;

    }

    public Person(String name, String sureName, String fatherName) {
        this.name = name;
        this.sureName = sureName;
        this.fatherName = fatherName;
    }
    public String initials(){
        if(name.isEmpty() && fatherName.isEmpty()) return sureName;
        else if (name.isEmpty()) return sureName + " " + fatherName.charAt(0)+".";
        else if (fatherName.isEmpty()) return sureName + " " + name.charAt(0)+".";
        else return sureName + " " + name.charAt(0)+"."+fatherName.charAt(0)+".";
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alexander","Popov","Ivanovich");
        System.out.println(person1.initials());
    }
}
