package com.example.demo.API;

import com.example.demo.BLA.bookManager;
import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookAPIController {
    @Autowired
    bookManager bookM;

    @GetMapping("/")
    public List<Book> getBooks() {
        return bookM.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable long id) {
        return bookM.getBookById(id);

    }

    @DeleteMapping("/{id}")
    public boolean deletBook(@PathVariable long id) {
        return bookM.deleteBook(id);

    }
}
