package com.pinsoft.gym.repository;

import com.pinsoft.gym.model.Meal;
import com.pinsoft.gym.model.MealList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealListRepository extends JpaRepository<MealList, Meal> {
}
