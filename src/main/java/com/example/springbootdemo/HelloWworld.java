package com.example.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/a")
public class HelloWworld {
    @GetMapping("/b")
    public String test(){

        System.out.println("000000000000000000");
        return "你好spring boot";
    }
}
