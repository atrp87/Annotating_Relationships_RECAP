package com.example.Annotating_Relationships.controllers;

import com.example.Annotating_Relationships.repositories.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity getOneUser(@PathVariable Long id){
        return new ResponseEntity<>(userRepository.findById(id), HttpStatus.OK);
    }
}
