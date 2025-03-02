package com.example.demo.Model;

import org.springframework.stereotype.Service;

@Service
public class Car {
    public String name ;
    public void print(){
        System.out.println(name);
    }
    
}
