package com.nishikanta.SpringSecurity;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/")
    public String greet() {
        return "Welcome to my website...";
    }
}
