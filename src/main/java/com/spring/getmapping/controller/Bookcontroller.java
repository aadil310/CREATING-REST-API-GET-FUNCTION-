package com.spring.getmapping.controller;


import java.util.List;

import com.spring.getmapping.entity.Book;
import com.spring.getmapping.services.Bookservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bookcontroller {

    @Autowired
    private Bookservices bookservices;
    


@GetMapping("/book")
    public List<Book> Getbook(){
        return this.bookservices.getAllBooks(); 
}

@GetMapping("/book/{id}")
public Book getBook(@PathVariable("id")int id){
    return bookservices.getBookById(id);
}


}