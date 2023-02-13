package com.pinsoft.gym.repository;

import com.pinsoft.gym.model.Nutrition;
import com.pinsoft.gym.model.NutritionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutritionTypeRepository extends JpaRepository<NutritionType, Nutrition> {
}
