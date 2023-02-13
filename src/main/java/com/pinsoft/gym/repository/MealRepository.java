package com.pinsoft.gym.repository;

import com.pinsoft.gym.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal, Integer> {
}
