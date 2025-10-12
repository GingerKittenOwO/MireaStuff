package ru.mirea.lab7.Ex7_8;

public class Book implements Printable{
    String name;
    String author;
    int year;
    Book(String name, String author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public void print() {
        System.out.printf("Книга '%s' (автор %s) была издана в %d году \n", name, author, year);}
}
