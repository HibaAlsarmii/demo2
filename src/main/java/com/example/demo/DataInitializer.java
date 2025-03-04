package com.example.demo;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    public CommandLineRunner loadData(BookRepository bookRepository) {
        return args -> {
            if (bookRepository.count() == 0) {  // Only add if database is empty
                bookRepository.save(new Book("Alchemist"));
                bookRepository.save(new Book("Benjamin"));
            }
        };
    }
}
