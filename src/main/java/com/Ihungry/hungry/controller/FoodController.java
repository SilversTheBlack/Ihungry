package com.Ihungry.hungry.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/food")
public class FoodController {
    
    @GetMapping
    public void getAllFood() {
        // Implementation for getting all food items
    }
}