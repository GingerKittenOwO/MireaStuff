package ru.mirea.lab7.Ex7_8;

public interface Printable {
    void print();
    static void printMagazines(Printable[] printable){
        for (Printable mag : printable){
            if(mag instanceof Journal){
                mag.print();
            }
        }
    }
    static void printBooks(Printable[] printable){
        for (Printable book : printable){
            if(book instanceof Book){
                book.print();
            }
        }
    }
}
