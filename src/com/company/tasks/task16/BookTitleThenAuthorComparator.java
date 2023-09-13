package com.company.tasks.task16;

import com.company.tasks.task12to15.Book;

import java.util.Comparator;

public class BookTitleThenAuthorComparator implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        return Comparator.comparing(Book::getTitle)
                .thenComparing(Book::getAuthor)
                .compare(book1,book2);
    }
}