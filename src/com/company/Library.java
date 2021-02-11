package com.company;

import java.util.ArrayList;

public class Library {
    private static Library library;
    private static ArrayList<Book> books = new ArrayList<>();

    public static synchronized Library getLibrary() {
        if (library == null) {
            library = new Library();
        }
        return library;
    }

    private Library() {
    }

    public void addBookToLibrary(Book book) {
        books.add(book);
    }

    public void showBooksFromLibrary() {
        books.forEach((b)-> System.out.println(b.getBookName()));
    }
}