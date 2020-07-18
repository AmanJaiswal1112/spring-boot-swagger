package com.prac.spring.swagger.api.service;

import com.prac.spring.swagger.api.dao.BookRepository;
import com.prac.spring.swagger.api.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class BookService
{
    @Autowired
    private BookRepository bookRepository;

    public String saveBook(Book book)
    {
        bookRepository.save(book);
        return "Bok saved with id ="+book.getId();
    }

    public Book getBook(int bookId)
    {
        return bookRepository.findOne(bookId);
    }

    public List<Book> removeBook(int bookId)
    {
        bookRepository.delete(bookId);
        return bookRepository.findAll();
    }

    /*public void updateBook(int bookId)
    {
        Book book = bookRepository.findOne(bookId);
        bookRepository.save(book);
    }*/

}
