package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Book;

import java.util.ArrayList;

@Controller
@RequestMapping("/")  // ✅ Make sure Spring recognizes the base path
public class HomeController {
    

    private Book bookA=new Book();

    private Book bookB=new Book();



    @GetMapping("/home")
    public ModelAndView index(){
        ArrayList <Book> list = new ArrayList();
        bookA.setBookName("Alchemist");
        bookB.setBookName("Benjamin");
        list.add(bookA);
        list.add(bookB);

        // Debugging Output
        System.out.println("DEBUG: Message = hello younis");
        System.out.println("DEBUG: Book Name = " + bookA.getBookName());

        ModelAndView m=new ModelAndView();
        m.setViewName("index");
        m.addObject("message", "hello younis");// maybe not correct
        m.addObject("bookName", bookA.getBookName());
        m.addObject("Books", list);


        return m;
    }
    
}


