package com.lib.example.libdemo.dao;

import com.lib.example.libdemo.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibDAO {
    public static List<Book> books = new ArrayList<>();
    static{
        books.add(new Book(1,"a","b"));
        books.add(new Book(2,"b","c"));
        books.add(new Book(3,"c","b"));
        books.add(new Book(4,"d","d"));
        books.add(new Book(5,"b","c"));
        books.add(new Book(6,"ac","b"));
    }
}
