package org.rca.app;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("978-0134685991", "Effective Java", "Joshua Manice", 2018));
        library.addBook(new Book("978-0596009205", "Head First Java", "chamberlain Gad, Robert Bates", 2005));
        library.addBook(new Book("978-0132350884", "Clean Code", "Ndamukunda J. Martin", 2008));
        library.addBook(new Book("978-0134494166", "Core Java Volume I", "Fabrice ISHIMWE", 2018));
        library.addBook(new Book("978-0135166307", "Core Java Volume II", "Smith Duke", 2019));

        // Adding members to the library
        Member member3 = new Member("M001", "Fabrice ISHfab");
        Member member1 = new Member("M001", "Alice Johnson");
        Member member2 = new Member("M002", "Valens James");

        library.addMember(member1);
        library.addMember(member2);
        library.addMember(member3);

        // Display available books
        System.out.println("Initial list of available books:");
        library.displayAvailableBooks();
        System.out.println();

        // Borrowing books
        System.out.println("Alice borrows 'Effective Java': " + library.borrowBook("M001", "978-0134685991"));
        System.out.println("Alice borrows 'Head First Java': " + library.borrowBook("M001", "978-0596009205"));
        System.out.println("Bob borrows 'Clean Code': " + library.borrowBook("M002", "978-0132350884"));
        System.out.println();

        // Display Alice's borrowed books
        System.out.println("Alice's borrowed books:");
        member1.displayBorrowedBooks();
        System.out.println();

        // Display Bob's borrowed books
        System.out.println("Bob's borrowed books:");
        member2.displayBorrowedBooks();
        System.out.println();

        // Display available books after borrowing
        System.out.println("List of available books after borrowing:");
        library.displayAvailableBooks();
        System.out.println();

        // Returning books
        System.out.println("Alice returns 'Effective Java': " + library.returnBook("M001", "978-0134685991"));
        System.out.println();

        // Display Alice's borrowed books after returning one
        System.out.println("Alice's borrowed books after returning one: ");
        member1.displayBorrowedBooks();
        System.out.println();

        // Display available books after returning
        System.out.println("List of available books after returning: ");
        library.displayAvailableBooks();
    }
}