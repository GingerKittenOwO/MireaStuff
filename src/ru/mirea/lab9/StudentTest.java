package ru.mirea.lab9;
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


    }
}
