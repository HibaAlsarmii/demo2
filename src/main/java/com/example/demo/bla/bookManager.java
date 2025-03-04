package com.example.demo.bla;

import com.example.demo.DAL.bookDAL;
import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bookManager {
    @Autowired
    bookDAL book;
    public List<Book> getBooks(){
        return book.selectAllBooks();
    }

    public Boolean addBook() {
        return book.saveBook();

    }
}
