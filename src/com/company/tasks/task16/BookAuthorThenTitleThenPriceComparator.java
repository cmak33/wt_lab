package com.company.tasks.task16;

import com.company.tasks.task12to15.Book;

import java.util.Comparator;

public class BookAuthorThenTitleThenPriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return Comparator.comparing(Book::getAuthor)
                .thenComparing(Book::getTitle)
                .thenComparing(Book::getPrice)
                .compare(o1,o2);
    }
}
