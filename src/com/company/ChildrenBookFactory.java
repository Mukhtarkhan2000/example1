package com.company;

public class ChildrenBookFactory implements MainAbstractFactory{
    private String bookName;
    private String authorName;
    private double bookPrice;

    public ChildrenBookFactory(String bookName, String authorName, double bookPrice){
        this.bookName=bookName;
        this.authorName=authorName;
        this.bookPrice=bookPrice;
    }

    @Override
    public Book createAnyBook(BookGenre genre) {
        Book childBook=null;
        switch (genre){
            case EDUCATIONAL:
                childBook = new EducationalBook(bookName, authorName, bookPrice);
                break;
            case FAIRLY_TALES:
                childBook = new FairlyTalesBook(bookName, authorName, bookPrice);
                break;
        }
        return childBook;
    }
}
