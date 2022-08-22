package com.example.demo.service;

import com.example.demo.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface IBooksService {

    List<Book> getAllBooks();

    Map<String, Integer> getStatistic();

    List<Book> getBooksByLetter(String latter);
}
