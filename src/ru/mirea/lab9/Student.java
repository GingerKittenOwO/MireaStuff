package ru.mirea.lab9;

public class Student implements Comparable<Student>{
    private int iDNumber;
    private String name;
    private double GPA;

    public Student(int iDNumber, String name, double GPA) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.GPA = GPA;
    }
    public Student(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }


    public static void insertSort(Student[] arr){
        for (int i =1;i<arr.length;i++){
            Student key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j].compareTo(key)>0){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        System.out.println("Sort is complete");
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber,other.iDNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
