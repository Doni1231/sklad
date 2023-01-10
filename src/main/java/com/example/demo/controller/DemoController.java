package com.example.demo.controller;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/")
public class DemoController {

    @GetMapping
    public String sayHello() {
        return "Hello";
    }


}

