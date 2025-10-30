package ru.mirea.lab9;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[]{new Student(4,"Ivan",34),
                new Student(3,"Vlad",20),
                new Student(6,"Egor",86),
                new Student(5,"Misha",78)};

        for (Student st : arr) System.out.println(st);
        Student.insertSort(arr);
        for (Student st : arr) System.out.println(st);


        System.out.println("\nSorting by GPA:");
        SortingStudentsByGPA srtGPA = new SortingStudentsByGPA();
        List<Student> list = Arrays.asList(arr);
        srtGPA.sortByGPA(list);
        for (Student student : list){
            System.out.println(student);
        }


        System.out.println("\nMerge sort and merging\n");

        Student[] arr1 = new Student[]{new Student(4,"Ivan",34),
                new Student(3,"Vlad",20),
                new Student(6,"Egor",86),
                new Student(5,"Misha",78)};
        Student[] arr2 = new Student[]{new Student(8,"Dmitriy",67),
                new Student(4,"Maria",84),
                new Student(1,"Sveta",53),
                new Student(13,"Kirill",65)};


        for (Student st : arr1) System.out.println(st);
        StudentMerger.mergeSort(arr1,0,arr1.length-1);
        System.out.println("Merge sorted completed");
        for (Student st : arr1) System.out.println(st);
        System.out.println("\n");

        for (Student st : arr2) System.out.println(st);
        StudentMerger.mergeSort(arr2,0,arr1.length-1);
        System.out.println("Merge sorted completed");
        for (Student st : arr2) System.out.println(st);


        Student[] merged = StudentMerger.mergeSortedLists(arr1,arr2);
        for (Student st : merged) System.out.println(st);



    }
}
