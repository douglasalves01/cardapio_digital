package com.example.cardapio.controller;

import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodRequestDTO;
import com.example.cardapio.food.FoodResponseDTO;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//RestController indica que isso é um controller da nossa aplicação
//mas tem que informar o endpoint que controla
@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodRepository repository;
    //GetMapping = classe é chamada quando o endpoint é chamado
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        repository.save(data);
    }
    @GetMapping
    public List<FoodResponseDTO> getAll(){
        List<FoodResponseDTO> foodList=repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}
