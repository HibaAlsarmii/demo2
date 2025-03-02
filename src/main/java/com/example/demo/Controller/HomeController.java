package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.Car;

@Controller
public class HomeController {
    
    @Autowired
    Car toyota;

    @GetMapping("/home")
    public ModelAndView index(){
        toyota.name="toyo";
        toyota.print();
        
    


        ModelAndView m=new ModelAndView();
        m.setViewName("index.html");
        m.addObject("message", "jhkjhkjhkj");
        return m;
    }
    
}
