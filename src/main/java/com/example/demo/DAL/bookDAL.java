package com.example.demo.DAL;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class bookDAL {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> selectAllBooks() {
        List<Book> books = (List<Book>) bookRepository.findAll();
        return books;
    }

    public boolean saveBook() {
        Book newbook = new Book();

        newbook.setBookName("SQL");
        System.out.println("IM IN DAL");
        bookRepository.save(newbook);
        return true;
    }
}
