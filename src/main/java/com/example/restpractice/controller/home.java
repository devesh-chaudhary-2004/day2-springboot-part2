package com.example.restpractice.controller;

import com.example.restpractice.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class home {
    @GetMapping("/")
    public StudentModel getStudent(){
        StudentModel student = new StudentModel(1,"devesh","abcd@gmail.com");
        return student;
    }

    @GetMapping("/allStudents")
    public ArrayList<StudentModel> allStudents() {
        String[][] arr = { {"devesh","abdb"}, {"devansh","fhj"},{"ayush","djsjs"},{"deeksha","kkjj"},{"arsh","ssd"}};
        ArrayList<StudentModel> list = new ArrayList<>();
        for(int i=1;i<=5;i++){
            StudentModel student = new StudentModel(i,arr[i-1][0],arr[i-1][1]);
            list.add(student);
        }
        return list;

    }
}
