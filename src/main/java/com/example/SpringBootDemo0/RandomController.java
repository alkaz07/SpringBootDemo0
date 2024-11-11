package com.example.SpringBootDemo0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController                     //класс отвечает на какие-то запросы http
                                    //и возвращает клиенту текст (не полноценный html, зато динамически)
public class RandomController {
    @GetMapping("/random")          //на какой именно запрос нужно вызвать данный метод
    public String getRandomNumber(){        //никаких параметров пока не читаем
        double x = Math.random();
        return String.valueOf(x);   //текст, который получит клиент
    }

    public RandomController() {
        System.out.println(" работает Конструктор RandomController");
    }
}
