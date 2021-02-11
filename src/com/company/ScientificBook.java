package com.company;

public class ScientificBook implements Book{
    private String bookName;
    private String authorName;
    private double bookPrice;

    public ScientificBook(String bookName, String authorName, double bookPrice){
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

    @Override
    public double getBookPrice() {
        return this.bookPrice;
    }

}
