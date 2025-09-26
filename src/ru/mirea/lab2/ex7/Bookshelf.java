package ru.mirea.lab2.ex7;

public class Bookshelf {
    private Book[] books;
    private int bookCount;

    public Bookshelf(int am){
        books = new Book[am];
        bookCount = 0;
    }
    public void addBook(Book book){
        if (bookCount<books.length){
            books[bookCount]=book;
            bookCount++;
        }
        else{
            System.out.println("Книжная полка азполнена!");
        }
    }

    public void addBook(String author,String name, int year){
        if (bookCount<books.length){
            books[bookCount]= new Book(author,name, year);
            bookCount++;
        }
        else{
            System.out.println("Книжная полка азполнена!");
        }
    }
    public Book oldest(){
        if(bookCount==0){
            return null;
        }
        else{
            Book oldest = books[0];
            for (int i = 1;i<bookCount;i++){
                if (oldest.getYear() > books[i].getYear()){
                    oldest = books[i];
                }
            }
            return oldest;
        }


    }
    public Book earliest(){
        if(bookCount==0){
            return null;
        }
        else{
            Book earliest = books[0];
            for (int i = 1;i<bookCount;i++){
                if (earliest.getYear() < books[i].getYear()){
                    earliest = books[i];
                }
            }
            return earliest;
        }
    }
    public void sortYear(){
        for (int i = 0; i<bookCount-1;i++){
            for (int j = 0; j<bookCount-1-i;j++){
                if (books[j].getYear()>books[j+1].getYear()){
                    Book temp = books[j];
                    books[j]=books[j+1];
                    books[j+1]=temp;
                }
            }
        }
    }
    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("Книжная полка пуста.");
        } else {
            System.out.println("На книжной полке:");
            for (int i = 0; i < bookCount; i++) {
                System.out.println("  " + (i + 1) + ". " + books[i]);
            }
        }
    }
}
