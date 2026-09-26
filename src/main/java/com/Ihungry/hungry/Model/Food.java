package com.Ihungry.hungry.Model;

import com.Ihungry.hungry.Repository.FoodRequestDTO;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "food")
@Entity(name = "food")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String foodName;
    private String foodDescription;
    private double foodPrice;
    private String category;
    private String foodImage;

    public Food(FoodRequestDTO data) {
        this.foodName = data.title();
        this.foodDescription = data.description();
        this.foodPrice = data.price();
        
    }
}
