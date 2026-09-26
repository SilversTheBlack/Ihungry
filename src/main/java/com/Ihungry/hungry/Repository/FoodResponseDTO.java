package com.Ihungry.hungry.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Ihungry.hungry.Model.Food;
public record FoodResponseDTO(Long id, String name, String description, Double price, String image, String category) {
    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getFoodName(), food.getFoodDescription(), food.getFoodPrice(), food.getFoodImage(), food.getCategory());
    }
}