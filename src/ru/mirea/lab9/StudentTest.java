package ru.mirea.lab9;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[]{new Student(4),new Student(3),new Student(6),new Student(5)};

        for (Student st : arr) System.out.println(st);
        Student.insertSort(arr);
        for (Student st : arr) System.out.println(st);
    }
}
