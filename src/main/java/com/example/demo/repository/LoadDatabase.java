package com.example.demo.repository;

import com.example.demo.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(BookRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Book(1,"Bilbo Baggins", "burglar","dwdawddwa")));
            log.info("Preloading " + repository.save(new Book(2,"Frodo Baggins", "thief","dwada")));
            log.info("Preloading " + repository.save(new Book(3,"Frodo Baggins", "thief","dwada")));
            log.info("Preloading " + repository.save(new Book(4,"Frodo Baggins", "thief","dwada")));
            log.info("Preloading " + repository.save(new Book(5,"Frodo Baggins", "thief","dwada")));
            log.info("Preloading " + repository.save(new Book(6,"Frodo Baggins", "thief","dwada")));
            log.info("Preloading " + repository.save(new Book(7,"Frodo Baggins", "thief","dwada")));
            log.info("Preloading " + repository.save(new Book(8,"Frodo Baggins", "thief","dwada")));
            log.info("Preloading " + repository.save(new Book(9,"Frodo Baggins", "thief","dwada")));
            log.info("Preloading " + repository.save(new Book(10,"Frodo Baggins", "thief","dwada")));
            log.info("Preloading " + repository.save(new Book(11,"Frodo Baggins", "thief","dwada")));
        };
    }
}