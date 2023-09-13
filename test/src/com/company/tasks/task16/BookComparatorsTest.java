package com.company.tasks.task16;

import com.company.tasks.task12to15.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class BookComparatorsTest {

    private final BookTitleComparator titleComparator = new BookTitleComparator();
    private final BookTitleThenAuthorComparator titleThenAuthorComparator = new BookTitleThenAuthorComparator();
    private final BookAuthorThenTitleComparator authorThenTitleComparator = new BookAuthorThenTitleComparator();
    private final BookAuthorThenTitleThenPriceComparator authorThenTitleThenPriceComparator = new BookAuthorThenTitleThenPriceComparator();
    private List<Book> books;
    Book book1 = new Book("B", "Author 1", 10,"");
    Book book2 = new Book("C", "Author 2", 20, "");
    Book book3 = new Book("A", "Author 3", 15, "");

    @BeforeEach
    public void setUp(){
        books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
    }

    @Test
    void givenBookCollection_whenSortByTitle_thanSort() {
        books.sort(titleComparator);

        List<Book> expected = new ArrayList<>();
        expected.add(book3);
        expected.add(book1);
        expected.add(book2);

        Assertions.assertEquals(expected, books);
    }

    @Test
    void givenBookCollection_whenSortByAuthorThenTitle_thanSort() {
        books.sort(authorThenTitleComparator);

        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);
        expected.add(book3);


        Assertions.assertEquals(expected, books);
    }

    @Test
    void givenBookCollection_whenSortByAuthorThenTitleThenPrice_thanSort() {
        books.sort(authorThenTitleThenPriceComparator);

        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book2);
        expected.add(book3);

        Assertions.assertEquals(expected, books);
    }

    @Test
    void givenBookCollection_whenSortByTitleThenAuthor_thanSort() {
        books.sort(titleThenAuthorComparator);

        List<Book> expected = new ArrayList<>();
        expected.add(book3);
        expected.add(book1);
        expected.add(book2);

        Assertions.assertEquals(expected, books);
    }
}
