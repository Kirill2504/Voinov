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
    }
}
