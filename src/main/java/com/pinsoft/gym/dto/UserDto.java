package com.pinsoft.gym.dto;

import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.io.Serializable;


@Data
public class UserDto implements Serializable {

    private String firstName;
    private String lastName;
    private String address;
    private String phone;

}
