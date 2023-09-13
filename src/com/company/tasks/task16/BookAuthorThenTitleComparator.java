package com.company.tasks.task16;

import com.company.tasks.task12to15.Book;

import java.util.Comparator;

public class BookAuthorThenTitleComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return Comparator.comparing(Book::getAuthor)
                .thenComparing(Book::getTitle)
                .compare(book1,book2);
    }
}
