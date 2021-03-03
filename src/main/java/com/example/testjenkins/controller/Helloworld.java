package com.example.testjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class Helloworld {

    @GetMapping
    public String getMessage(String req){

        if (req == "s"){
            System.out.println("hello world");
        }
        return "helloworld-test-jenkins";
    }
}
