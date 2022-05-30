package com.spring.getmapping.services;

import java.util.ArrayList;
import java.util.List;

import com.spring.getmapping.entity.Book;

import org.springframework.stereotype.Component;

@Component
public class Bookservices {

    private static List<Book> list=new ArrayList<>();

    static{
        list.add(new Book("C++",101,"CWH","30/05/2022"));
        list.add(new Book("java",102,"CWH","10/05/2022"));
        list.add(new Book("C++",101,"CWH","20/05/2022"));
        list.add(new Book("C++",101,"CWH","25/05/2022"));
    }
    //get all books.....
    public List<Book> getAllBooks(){
        return list;
    }

    //get single book....
    public Book getBookById(int id){
        Book book=null;
        book=list.stream().filter(e->e.getBookId()==id).findFirst().get();
        
        return book;
        
    }


    
}
