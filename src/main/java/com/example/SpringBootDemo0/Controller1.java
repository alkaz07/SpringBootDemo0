package com.example.SpringBootDemo0;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {
    @GetMapping("/hello")
    public String hello( String username){
        return "Ну здравствуй, "+username;
    }

    public Controller1() {
        System.out.println(" работает Конструктор Controller1" );
    }
}
