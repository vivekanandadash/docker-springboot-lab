package com.vivek.dockerfilecustomport.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class customPortController {
    @GetMapping("/custom")
    public String customWelcome(){
        return "use custom Docker port mapping for enabling multiple applications to run simultaneously without port conflicts.";
    }
}
