package com.example.demo.model;  // ✅ Ensure lowercase "model"

import org.springframework.stereotype.Component;

@Component
public class Book {
    private String bookName;  // ✅ Default book name

    public String getBookName() {  // ✅ Getter for bookName
        return bookName;
    }

    public void setBookName(String bookName) {  // ✅ Setter for bookName
        this.bookName = bookName;
    }
}
