package com.prac.spring.swagger.api.controller;

import com.prac.spring.swagger.api.model.Book;
import com.prac.spring.swagger.api.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/book")
@Api(value = "Book Service", description = "My book store")
public class BookController
{

    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    @ApiOperation(value = "Store Book api")
    public String saveBook(@RequestBody Book book)
    {
       return bookService.saveBook(book);
    }

    @GetMapping("/searchBook/{bookId}")
    @ApiOperation(value = "Search Book api")
    public Book getBook(@PathVariable int bookId)
    {
        return bookService.getBook(bookId);
    }

    @DeleteMapping("/deleteBook/{bookId}")
    public List<Book> deleteBook(@PathVariable int bookId)
    {
       return bookService.removeBook(bookId);
    }

}
