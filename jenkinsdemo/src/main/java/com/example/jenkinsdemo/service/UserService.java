package com.example.jenkinsdemo.service;

import com.example.jenkinsdemo.model.User;
import com.example.jenkinsdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User saveUser(User user){
        return userRepository.save(user);
    }

}
