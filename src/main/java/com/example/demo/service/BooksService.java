package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class BooksService implements IBooksService {

    @Autowired
    private BookRepository repository;

    @Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    @Override
    public Map<String, Integer> getStatistic() {
        List<Book> listBooks = repository.findAll();
        Map<String, Integer> hashMap = new HashMap<>();
        for (Book book : listBooks) {
            if (hashMap.containsKey(book.getName().toLowerCase().substring(0, 1))) {
                hashMap.put(book.getName().toLowerCase().substring(0, 1), hashMap.get(book.getName().toLowerCase().substring(0, 1)) + 1);
            } else {
                hashMap.put(book.getName().toLowerCase().substring(0, 1), 1);
            }
        }
        return hashMap;
    }

    @Override
    public List<Book> getBooksByLetter(String latter) {
        List<Book> listBooks = repository.findAll();
        return listBooks.stream().filter(x -> x.getName().substring(0, 1).equalsIgnoreCase(latter)).collect(Collectors.toList());
    }

}
