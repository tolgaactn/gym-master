package com.pinsoft.gym.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateNutritionDto {
    private String name;
    private Double kcal;
    private Double protein;
    private Double carbonhydrate;
    private Double fat;
    private Double baseWeight;
}


