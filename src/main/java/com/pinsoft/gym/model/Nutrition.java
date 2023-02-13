package com.pinsoft.gym.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "nutrition", schema = "public")
public class Nutrition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "kcal")
    private Double kcal;
    @Column(name = "protein")
    private Double protein;
    @Column(name = "carbonhydrate")
    private Double carbonhydrate;
    @Column(name = "fat")
    private Double fat;
    @Column(name = "base_weight")
    private Double baseWeight;
    @OneToOne
    @JoinColumn(name="nutrition_type_id")
    private NutritionType nutritionType;
    @OneToMany(mappedBy = "nutrition")
    private Set<MealList> mealList;
}
