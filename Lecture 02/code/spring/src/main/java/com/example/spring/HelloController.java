package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // --> /hello

    @GetMapping("hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @GetMapping("greet")
    public String greet(){
        return "<h1>Hi! Adarsh Gupta</h1>";
    }
}
