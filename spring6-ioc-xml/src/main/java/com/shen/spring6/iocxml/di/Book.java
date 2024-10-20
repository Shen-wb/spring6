package com.shen.spring6.iocxml.di;

public class Book {
    private String bname;
    private String author;
    private String other;

    public Book() {}

    public Book(String bname, String author, String other) {
        this.bname = bname;
        this.author = author;
        this.other = other;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", other='" + other + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }
}
