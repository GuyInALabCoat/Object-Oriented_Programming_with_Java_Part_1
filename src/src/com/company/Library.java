package com.company;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    public Library(){       // constructor, creates an empty arrayList for the Book objects
        books = new ArrayList<Book>();

    }

    public void addBook(Book book){     // adds books to the ArrayList created by the constructor
        this.books.add(book);
    }

    public void printBooks(){           // prints the current list of books in the Library, each on a separate line
        for (Book book:books) {
            System.out.println(book);
        }

    }

    public ArrayList<Book> searchByTitle(String title){     // returns a list of books that match the given Title
        ArrayList<Book> found = new ArrayList<Book>();         // create empty arrayList to hold found books

        for (Book book:books) {
            if(StringUtils.included(book.getTitle(), title)){   // if the title of a Book object matches the given title
                found.add(book);                                // the book is added to the arrayList
            }                                                   // the included method allows us to conduct flexible search
        }                                                       // ignoring Capitalization and white spaces

        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher){     // similar to searchByTitle only for publishers
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book book:books) {
            if(StringUtils.included(book.getPublisher(), publisher)){
                found.add(book);
            }
        }

        return found;
    }

    public ArrayList<Book> searchByYear(int year){                  // similar to searchByTitle only for years
        ArrayList<Book> found = new ArrayList<Book>();

        for (Book book: books){
            if(book.getYear() == year){
                found.add(book);
            }
        }

        return found;

    }

    public static void main(String[] args){
        Library Library = new Library();

        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        for (Book book: Library.searchByTitle("CHEESE")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library.searchByPublisher("PENGUIN   ")) {
            System.out.println(book);
        }

    }
}
