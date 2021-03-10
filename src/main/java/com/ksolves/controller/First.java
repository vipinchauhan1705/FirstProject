package com.ksolves.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class First {
    @GetMapping("/show")
    public List<Home> show()
    {

        return Arrays.asList(
            new Home("shiva","python ","btech") ,
                new Home("priya","java","btech")
        );

    }


}
