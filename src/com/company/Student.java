package com.company;

import java.util.ArrayList;

public class Student extends User{

    private int userID;
    private String userName;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private boolean membership;

    @Override
    void borrow() {
        borrowedBooks.forEach((b)-> System.out.print(b.getBookName() + ", "));
        System.out.println();
    }

    @Override
    double calculate() {
        double total = 0;
        for (Book b : borrowedBooks) {
            total += b.getBookPrice();
        }
        return total;
    }

    @Override
    public void addID(int userID) {
        this.userID=userID;
    }

    @Override
    public void addName(String userName) {
        this.userName=userName;
    }

    @Override
    public void addBorrowedBooks(Book borrowedBooks) {
        this.borrowedBooks.add(borrowedBooks);
    }

    @Override
    public void addMembership(boolean membership) {
        this.membership=membership;
    }

    @Override
    public String getUserName() {
        return this.userName;
    }
    @Override
    public int getUserID() {
        return this.userID;
    }
    @Override
    public ArrayList getUserBorrowedBooks() {
        return this.borrowedBooks;
    }
    @Override
    public boolean getUserMembership() {
        return this.membership;
    }
}