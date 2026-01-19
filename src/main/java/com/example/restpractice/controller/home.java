package com.example.restpractice.controller;

import com.example.restpractice.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class home {
    @GetMapping("/")
    public StudentModel getStudent(){
        StudentModel student = new StudentModel(1,"devesh","abcd@gmail.com");
        return student;

    }
}
