package com.lib.example.libdemo.controller;

import com.lib.example.libdemo.model.Book;
import com.lib.example.libdemo.service.LibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibController {
    @Autowired
    LibService libService;

    @GetMapping("/allBooks")
    public List<Book> allBooks(){
        return libService.allBooks();
    }

    @GetMapping("/getByAuthor/{author}")
    public List<Book> getByAuthor(@PathVariable String author){
        return libService.getByAuthor(author);
    }

    @GetMapping("/getByTitle/{title}")
    public List<Book> getByPartTitle(@PathVariable String title){
        return libService.getByPartTitle(title);
    }

    @PostMapping("/addBook")
    public List<Book> addBook(@RequestBody Book book){
        return libService.addBook(book);
    }
}
