package ru.mirea.lab2.ex7;

public class Book {
    private String author;
    private String name;
    private int year;
//    private int publication;
//    private String publisher;



    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

//    public int getPublication() {
//        return publication;
//    }
//
//    public void setPublication(int publication) {
//        this.publication = publication;
//    }
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year+"}";
    }
}
