package com.ksolves.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
    @GetMapping("/")
    public String show()
    {
        return "hello! geeks";
    }


}
