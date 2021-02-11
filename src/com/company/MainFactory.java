package com.company;

public class MainFactory {
    public static Book getBook(MainAbstractFactory factory, BookGenre genre){
        return factory.createAnyBook(genre);
    }
}