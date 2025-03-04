package com.example.demo.controller;

import com.example.demo.bla.bookManager;
import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    bookManager bookM;

    @GetMapping("/home")
    public ModelAndView index() {

        ModelAndView m = new ModelAndView();
        m.setViewName("index");
        m.addObject("message", "hello younis");
        m.addObject("Books",  bookM.getBooks());

        return m;
    }
    @GetMapping("/addBook")
    public String addBook() {
        System.out.println("addBook");

        bookM.addBook();
        return "redirect:/home";
    }
}
