package com.library.project.service;

import com.library.project.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.library.project.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book getBookByID(Long bookId) {
        return bookRepository.findById(bookId).orElse(null);
    }



}
