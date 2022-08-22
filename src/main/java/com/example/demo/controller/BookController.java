package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.IBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController()
@RequestMapping(value = "/api")
public class BookController {

    @Autowired
    private IBooksService booksService;


    @GetMapping(value = "/getBooks")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getBooks() {
        return booksService.getAllBooks();
    }

    @GetMapping(value = "/getStatistic")
    @ResponseStatus(HttpStatus.OK)
    public Map<String, Integer> getStatistic() {
        return booksService.getStatistic();
    }

    @GetMapping(value = "/getBooksByLetter/{latter}")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getBooksByLetter(@PathVariable String latter) {
        return booksService.getBooksByLetter(latter);
    }

}
