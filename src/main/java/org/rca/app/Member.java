package org.rca.app;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String id;
    private String name;
    private List<Book> borrowedBooks;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Methods
    public boolean borrowBook(Book book) {
        if (borrowedBooks.size() < 5 && !book.isBorrowed()) {
            borrowedBooks.add(book);
            book.setBorrowed(true);
            return true;
        }
        return false;
    }

    public boolean returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setBorrowed(false);
            return true;
        }
        return false;
    }

    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has no borrowed books.");
        } else {
            System.out.println(name + "'s borrowed books:");
            for (Book book : borrowedBooks) {
                System.out.println(book);
            }
        }
    }
}