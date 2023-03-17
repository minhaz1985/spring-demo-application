package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
        @RequestMapping("/")
        public String hello()
        {
            System.out.println("hello world");
            return "Hello World!";
        }
    }
