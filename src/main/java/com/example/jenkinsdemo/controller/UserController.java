package com.example.jenkinsdemo.controller;


import com.example.jenkinsdemo.model.User;
import com.example.jenkinsdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;



    @PostMapping("/add")
    public User addProduct(@RequestBody User user){
        return userService.saveUser(user);
    }


}
