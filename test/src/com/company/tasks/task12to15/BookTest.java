package com.company.tasks.task12to15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void givenBook_whenClone_thanReturnCloneObject() {
        Book book = new Book("title","author",1,"isbn");
        Book clone = book.clone();

        assertEquals(book.getAuthor(),clone.getAuthor());
        assertEquals(book.getTitle(), clone.getTitle());
        assertEquals(book.getPrice(), clone.getPrice());
        assertEquals(book.getIsbn(), clone.getIsbn());
    }

    @Test
    void givenBookCollection_whenSort_thanSortCollection(){
        Book book1 = new Book("Title 1", "Author 1", 10, "ISBN-001");
        Book book2 = new Book("Title 2", "Author 2", 20, "ISBN-003");
        Book book3 = new Book("Title 3", "Author 3", 15, "ISBN-002");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Collections.sort(books);

        List<Book> expected = new ArrayList<>();
        expected.add(book1);
        expected.add(book3);
        expected.add(book2);

        Assertions.assertEquals(expected, books);
    }
}