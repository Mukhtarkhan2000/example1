package com.company;

public class EducationalBook implements Book{
    private String bookName;
    private String authorName;
    private double bookPrice;

    public EducationalBook(String bookName, String authorName, double bookPrice){
        this.bookName=bookName;
        this.authorName=authorName;
        this.bookPrice=bookPrice;
    }
    @Override
    public String getBookName() {
        return this.bookName;
    }

    @Override
    public String getAuthorName() {
        return this.authorName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

}
