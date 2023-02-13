package com.pinsoft.gym.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="meal_list",schema = "public")
public class MealList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name="meal_id")
    private Meal meal;
    @ManyToOne
    @JoinColumn(name="nutrition_id")
    private Nutrition nutrition;
    @Column(name = "weight")
    private Double weight;
    @Column(name = "created_date")
    private LocalDateTime createdDate;
}
