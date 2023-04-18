package com.tuto.learnspringsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRessource {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello Moe";
    }
    
}