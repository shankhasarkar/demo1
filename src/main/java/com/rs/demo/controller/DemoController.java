package com.rs.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
public class DemoController {

    @GetMapping("/greeting")
    public String getHello() {
        return "Hello Rajarsi";
    }
}
