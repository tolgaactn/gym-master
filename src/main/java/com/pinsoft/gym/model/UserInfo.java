package com.pinsoft.gym.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user_info",schema = "public")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @OneToOne(mappedBy = "userInfo")
    private User user;
    @Column(name = "lenght")
    private Integer lenght;
    @Column(name = "weight")
    private Double weight;
    @Column(name = "age")
    private Integer age;
}
