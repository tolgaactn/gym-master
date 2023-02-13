package com.pinsoft.gym.service;

import com.pinsoft.gym.model.Nutrition;

public interface NutritionService {
    Nutrition getById(Integer id);
    Nutrition getByCarbonhydrateValue(Double val);
}
