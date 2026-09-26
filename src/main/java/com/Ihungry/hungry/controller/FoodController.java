package com.Ihungry.hungry.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Ihungry.hungry.Model.Food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.Ihungry.hungry.Repository.FoodResponseDTO;
import com.Ihungry.hungry.Repository.foodRepository;

@RestController
@RequestMapping("/api/food")
public class FoodController {

    @Autowired
    public FoodController() {
        // Constructor implementation
    }

    private foodRepository foodResponseDTO;

    @GetMapping
    public List<FoodResponseDTO> getAllFood() {
        List<FoodResponseDTO> foodList = foodResponseDTO.findAll().stream()
                .map(FoodResponseDTO::new)
                .toList();
        return foodList;
    }

}