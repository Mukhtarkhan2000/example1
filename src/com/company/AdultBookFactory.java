package com.company;

public class AdultBookFactory implements MainAbstractFactory{

    private String bookName;
    private String authorName;
    private double bookPrice;

    public AdultBookFactory(String bookName, String authorName, double bookPrice){
        this.bookName=bookName;
        this.authorName=authorName;
        this.bookPrice=bookPrice;
    }


    @Override
    public Book createAnyBook(BookGenre genre) {
        Book adultBook=null;
        switch (genre){
            case ART:
                adultBook = new ArtBook(bookName,authorName,bookPrice);
                break;
            case SCIENTIFIC:
                adultBook = new ScientificBook(bookName,authorName,bookPrice);
                break;
            case HISTORICAL:
                adultBook = new HistoricalBook(bookName,authorName,bookPrice);
                break;
        }
        return adultBook;
    }
}
