package com.example.jenkinsdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
//    @Autowired
//    private UserService userService;
//
//

    @PostMapping("/add")
    public String addProduct(){
        return "it works";
    }


}
