package com.company;

public class Book {
    private String title;           // instance variables title, publisher, and year
    private String publisher;
    private int year;

    public Book(String title, String publisher, int year) { // constructor, sets instance vars to given values
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }


    public String getPublisher() {
        return this.publisher;
    }

    public int getYear() {
        return this.year;
    }


    public String toString() {      // toString method overrides the default toString method
        return getTitle() + ", " + getPublisher() + ", " + getYear();
    }

    public static void main(String[] args){
        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        System.out.println(cheese.getTitle());
        System.out.println(cheese.getPublisher());
        System.out.println(cheese.getYear());

        System.out.println(cheese);
    }
}
