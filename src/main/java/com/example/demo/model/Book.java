package com.example.demo.model;

import javax.persistence.*;


@Entity  // Marks this class as a table in SQLite
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment for SQLite
    private Long id;

    @Column(nullable = false)
    private String bookName;

    // Default Constructor
    public Book() {}

    // Constructor with parameter
    public Book(String bookName) {
        this.bookName = bookName;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
