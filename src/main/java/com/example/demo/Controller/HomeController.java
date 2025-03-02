package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.Book;

@Controller
public class HomeController {
    
    @Autowired
    Book bookA;

    @GetMapping("/home")
    public ModelAndView index(){
        bookA.bookName="alchymist";
      
            
        ModelAndView m=new ModelAndView();
        m.setViewName("index.html");
        m.addObject("message", "hello younis");// maybe not correct
        return m;
    }
    
}
