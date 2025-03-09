package com.example.demo.controller;

import com.example.demo.BLA.bookManager;
import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    bookManager bookM;

    // ✅ Show all books on /home page
    @GetMapping("/home")
    public ModelAndView index() {
        ModelAndView m = new ModelAndView();
        m.setViewName("index");
        m.addObject("message", "hello younis");
        m.addObject("Books", bookM.getBooks());
        return m;
    }

    // ✅ Add a new book
    @PostMapping("/addBook")
    public String addBook( String bookName) {
        bookM.addBook(bookName);
        return "redirect:/home";
    }

    // ✅ Delete a book by ID
    @DeleteMapping("/deleteBook")
    public String deleteBook(Long bookId) {
        bookM.deleteBook(bookId);
        System.out.println("book deleted");
        return "redirect:/home";
    }

    // ✅ Show Edit Book Page (NEW)
    @GetMapping("/editBook/{id}")
    public ModelAndView editBook(@PathVariable Long id) {
        ModelAndView m = new ModelAndView("edit-book");
        Book book = bookM.getBookById(id);
        m.addObject("book", book);
        return m;
    }

    // ✅ Handle Book Update Request (NEW)
    @PostMapping("/updateBook")
    public String updateBook(@RequestParam Long bookId, @RequestParam String bookName) {
        bookM.updateBook(bookId, bookName);
        return "redirect:/home";
    }
}
