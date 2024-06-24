package org.rca.app;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int publicationYear;
    private boolean isBorrowed;

    public Book(String isbn, String title, String author, int publicationYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    // Setters
    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + isbn + '\'' +
                ", Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Publication Year=" + publicationYear +
                ", Borrowed=" + isBorrowed +
                '}';
    }
}