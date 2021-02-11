package com.company;

public class UserBuilder {
    User user;

    public UserBuilder(UserType type) throws Exception {
        user = new UserFactory().createUser(type);
    }
    public UserBuilder addID(int userid) {
        user.addID(userid);
        return this;
    }
    public UserBuilder addName(String username) {
        user.addName(username);
        return this;
    }
    public UserBuilder addBorrowedBooks(Book borrowedBooks) {
        user.addBorrowedBooks(borrowedBooks);
        return this;
    }
    public UserBuilder addMembership(boolean membership) {
        user.addMembership(membership);
        return this;
    }

    public User build() {
        return user;
    }

}