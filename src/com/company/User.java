package com.company;

import java.util.ArrayList;

public abstract class User {

    abstract void borrow();
    abstract double calculate();

    public abstract void addID(int userID);
    public abstract void addName(String userName);
    public abstract void addBorrowedBooks(Book borrowedBooks);
    public abstract void addMembership(boolean membership);

    public abstract String getUserName();
    public abstract int getUserID();
    public abstract ArrayList getUserBorrowedBooks();
    public abstract boolean getUserMembership();


}