package com.company.tasks.task12to15;

import java.util.Objects;

public class Book implements Cloneable, Comparable<Book> {
    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    private final String title;
    private final String author;
    private final int price;
    private final String isbn;
    private static int edition;

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book other = (Book) obj;
        return price == other.price &&
                isbn.equals(other.isbn) &&
                title.equals(other.title) &&
                author.equals(other.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn,title, author, price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public Book clone() {
        try {
            Book cloneBook = (Book) super.clone();
            return cloneBook;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public int compareTo(Book o) {
        return isbn.compareTo(o.isbn);
    }
}
