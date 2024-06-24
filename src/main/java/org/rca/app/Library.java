package org.rca.app;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // Methods
    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void displayAvailableBooks() {
        System.out.println("Available books:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book);
            }
        }
    }

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public Member findMemberById(String id) {
        for (Member member : members) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }

    public boolean borrowBook(String memberId, String isbn) {
        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member != null && book != null) {
            return member.borrowBook(book);
        }
        return false;
    }

    public boolean returnBook(String memberId, String isbn) {
        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);

        if (member != null && book != null) {
            return member.returnBook(book);
        }
        return false;
    }
}