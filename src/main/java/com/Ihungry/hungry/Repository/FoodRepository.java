package com.Ihungry.hungry.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ihungry.hungry.Model.Food;
@Repository 
public interface foodRepository extends JpaRepository<Food, Long> {
    
}