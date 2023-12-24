package com.example.cardapio.controller;

import com.example.cardapio.food.Food;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//RestController indica que isso é um controller da nossa aplicação
//mas tem que informar o endpoint que controla
@RestController
@RequestMapping("food")
public class FoodController {
    //GetMapping = classe é chamada quando o endpoint é chamado
    @GetMapping
    public void getAll(){
        Food food
    }
}
