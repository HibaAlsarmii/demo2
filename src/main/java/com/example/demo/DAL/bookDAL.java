package com.example.demo.DAL;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;
import java.util.List;

@Component
public class bookDAL {

    @Autowired
    private BookRepository bookRepository;

    // ✅ Retrieve all books
    public List<Book> selectAllBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    // ✅ Save a new book
    public boolean saveBook(String bookName) {
        Book newBook = new Book();
        newBook.setBookName(bookName);
        bookRepository.save(newBook);
        System.out.println("Book Added: " + bookName);
        return true;
    }

    // ✅ Delete a book by ID
    public boolean removeBook(Long bookId) {
        if (bookRepository.existsById(bookId)) {
            bookRepository.deleteById(bookId);
            System.out.println("Book Deleted: ID " + bookId);
            return true;
        }
        System.out.println("Book Not Found: ID " + bookId);
        return false;
    }

    // ✅ Find a book by ID (NEW)
    public Book findBookById(Long bookId) {
        Optional<Book> book = bookRepository.findById(bookId);
        return book.orElse(null);
    }

    // ✅ Update book name (NEW)
    public boolean updateBookName(Long bookId, String bookName) {
        Optional<Book> book = bookRepository.findById(bookId);
        if (book.isPresent()) {
            Book existingBook = book.get();
            existingBook.setBookName(bookName);
            bookRepository.save(existingBook);
            System.out.println("Book Updated: ID " + bookId + " New Name: " + bookName);
            return true;
        }
        System.out.println("Book Not Found: ID " + bookId);
        return false;
    }
}
