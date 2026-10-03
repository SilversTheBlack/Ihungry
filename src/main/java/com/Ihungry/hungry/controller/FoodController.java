package com.Ihungry.hungry.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ihungry.hungry.Model.Food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Ihungry.hungry.Repository.FoodRequestDTO;
import com.Ihungry.hungry.Repository.FoodResponseDTO;
import com.Ihungry.hungry.Repository.FoodRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    @Autowired
    public FoodController() {
        // Constructor implementation
    }

    private FoodRepository repository;

    @GetMapping
    public List<FoodResponseDTO> getAllFood() {
        List<FoodResponseDTO> foodList = repository.findAll().stream()
                .map(FoodResponseDTO::new)
                .toList();
        return foodList;
    }

    @PostMapping("path")
    public void saveFood(@RequestBody FoodRequestDTO data) {
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }

}