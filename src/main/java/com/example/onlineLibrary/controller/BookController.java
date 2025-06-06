package com.example.onlineLibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @GetMapping("/books/add")
    public String addBook(){
        return "addBook";
    }
}
