package com.pinsoft.gym.service.impl;

import com.pinsoft.gym.model.Nutrition;
import com.pinsoft.gym.repository.NutritionRepository;
import com.pinsoft.gym.service.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NutritionServiceImpl implements NutritionService {

    @Autowired
    private NutritionRepository nutritionRepository;
    @Override
    public Nutrition getById(Integer id) {
        return nutritionRepository.getById(id);
    }
    @Override
    public Nutrition getByCarbonhydrateValue(Double val) {
        return nutritionRepository.getByCarbonhydrateValue(val);
    }
}
