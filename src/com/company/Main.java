package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here

        Book historyBook= MainFactory.getBook(
                new AdultBookFactory("History of Kazakhstan",
                        "Nalibayev Mukhtarkhan", 1500),BookGenre.HISTORICAL);
        Book artBook= MainFactory.getBook(
                new AdultBookFactory("Abay zholy",
                        "Mukhtar Auezov", 1000),BookGenre.ART);
        Book educationalBook= MainFactory.getBook(
                new ChildrenBookFactory("English",
                        "Svetlana Battalovna", 500),BookGenre.EDUCATIONAL);

        Library.getLibrary().addBookToLibrary(historyBook);
        Library.getLibrary().addBookToLibrary(artBook);
        Library.getLibrary().addBookToLibrary(educationalBook);

        User student1 = new UserFactory().createUser(UserType.STUDENT);
        student1.addID(111);
        student1.addName("Mukhtarkhan Nalibayev");
        student1.addBorrowedBooks(historyBook);
        student1.addBorrowedBooks(artBook);
        student1.addMembership(true);

        User pupil1 = new UserFactory().createUser(UserType.PUPIL);
        pupil1.addID(222);
        pupil1.addName("Arman");
        pupil1.addBorrowedBooks(educationalBook);
        pupil1.addMembership(false);

        System.out.println("Borrowed books of " + student1.getUserName());
        student1.borrow();

        System.out.println();

        System.out.println("Price of Borrowed books of " + student1.getUserName() + "\n" +
                student1.calculate());
    }
}
