package com.company.Interface;

/**
 * Created by Student on 30.05.2018.
 */
public class Book implements Printable {
    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public void print() {
        System.out.println("Читаю " + this);
    }

    public static void printBook(Printable[] array) {
        for (Printable printable : array) {
            if (printable instanceof Book) {
                System.out.println(printable);
            }
        }
    }

    public static void main(String[] args) {
        Book book=new Book("Book1");
        Book book1=new Book("Book1");
        Magazine magazine=new Magazine("Book1");
        Printable[]printables={book,book1,magazine};
        Book.printBook(printables);
    }
}
