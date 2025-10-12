package ru.mirea.lab7.Ex7_8;

public class PrintableTest {
    public static void main(String[] args) {
        Printable pr1 = new Book( "Life and suffering of the student Ivan","Ivan V.",2025);
        Printable pr2 = new Journal("MIREA news");
        Printable pr3 = new Journal("FORBES");
        Printable[] arr = new Printable[]{pr1,pr2,pr3};
        Printable.printMagazines(arr);
        Printable.printBooks(arr);
    }
}
