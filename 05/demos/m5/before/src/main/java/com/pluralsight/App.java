package com.pluralsight;

import com.pluralsight.model.Book;
import com.pluralsight.repository.BookDao;
import com.pluralsight.repository.Dao;

import java.util.List;
import java.util.Optional;

public class App {
    public static void main( String[] args ) {
        Dao<Book> bookDao = new BookDao();

        List<Book> books = bookDao.findAll();

        for (Book book : books) {
            System.out.println("Id: " + book.getId());
            System.out.println("Title: " + book.getTitle());
        }

        Optional<Book> optBook = bookDao.findById(1);
        if(optBook.isPresent()) {
            Book book = optBook.get();

            System.out.println("Id: " + book.getId());
            System.out.println("Title: " + book.getTitle());
        }
    }
}
