package com.pinsoft.gym.controller;

import com.pinsoft.gym.dto.UserDto;
import com.pinsoft.gym.model.User;
import com.pinsoft.gym.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user){
        UserDto resulUser = userService.createUser(user);
        return ResponseEntity.ok(resulUser);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<User>>getUsers(){
    List<User> users = userService.getUsers();
    return ResponseEntity.ok(users);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id")int id){

        User user = userService.getUser(id);
        return ResponseEntity.ok(user);
    }
    @PutMapping("/edit/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id")int id,@RequestBody User user){
        User resultUser = userService.updateUser(id,user);
        return ResponseEntity.ok(resultUser);
    }
    @DeleteMapping("/remove/{id}")
    public  ResponseEntity<Boolean>deleteUser(@PathVariable("id")int id){
    Boolean status = userService.deleteUser(id);
    return ResponseEntity.ok(status);
    }
}
