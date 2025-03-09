package com.example.demo.BLA;

import com.example.demo.DAL.bookDAL;
import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class bookManager {

    @Autowired
    private bookDAL book;

    // ✅ Get all books
    public List<Book> getBooks() {
        return book.selectAllBooks();
    }

    // ✅ Add a new book
    public Boolean addBook(String bookName) {
        return book.saveBook(bookName);
    }

    // ✅ Delete a book by ID
    public Boolean deleteBook(Long bookId) {
        return book.removeBook(bookId);
    }

    // ✅ Get a book by ID (NEW)
    public Book getBookById(Long bookId) {
        return book.findBookById(bookId);
    }

    // ✅ Update book name (NEW)
    public Boolean updateBook(Long bookId, String bookName) {
        return book.updateBookName(bookId, bookName);
    }
}
