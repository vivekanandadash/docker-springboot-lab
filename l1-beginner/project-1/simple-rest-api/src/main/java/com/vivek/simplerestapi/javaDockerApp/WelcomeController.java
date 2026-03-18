package com.vivek.simplerestapi.javaDockerApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String hello(){
     return "hello World from Docker , we welcome you";
    }
}
