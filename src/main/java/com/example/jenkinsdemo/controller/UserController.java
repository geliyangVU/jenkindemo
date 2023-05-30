package com.example.jenkinsdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {


    @PostMapping("/add")
    public String addUser(){
        return "it works";
    }


    @PostMapping("/update")
    public String updateUser(){
        return "update works";
    }

    @PostMapping("/delete")
    public String deleteUser(){
        return "delete works";
    }


}
