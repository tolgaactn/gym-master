package com.pinsoft.gym.controller;

import com.pinsoft.gym.dto.CreateNutritionDto;
import com.pinsoft.gym.model.Nutrition;
import com.pinsoft.gym.repository.NutritionRepository;
import com.pinsoft.gym.service.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nutrition")
public class NutritionController {
    @Autowired
    private NutritionService nutritionService;
    @GetMapping("/{id}")
    Nutrition getNutrition(@PathVariable Integer id){
        return nutritionService.getById(id);
    }
    @GetMapping("/{val}")
    Nutrition getNutrition(@PathVariable Double val){
        return nutritionService.getByCarbonhydrateValue(val);
    }

    @GetMapping("/allNutrition")
    List<Nutrition> getAll() {
        return getAll();
    }
}

