package com.lib.example.libdemo.service;

import com.lib.example.libdemo.dao.LibDAO;
import com.lib.example.libdemo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibService {
    @Autowired
    LibDAO libDAO;
    public List<Book> allBooks(){
        return libDAO.books;
    }

    public List<Book> getByAuthor(String author) {
        List<Book> resBooks = new ArrayList<>();
        for(Book b :libDAO.books){
            if(b.getAuthor().equals(author)){
                resBooks.add(b);
            }
        }
        return resBooks;
    }

    public List<Book> getByPartTitle(String title) {
        List<Book> resBooks = new ArrayList<>();
        for(Book b :libDAO.books){
            if(b.getTitle().toLowerCase().contains(title.toLowerCase())){
                resBooks.add(b);
            }
        }
        return resBooks;
    }

    public List<Book> addBook(Book book) {
        libDAO.books.add(book);
        return libDAO.books;
    }
}
