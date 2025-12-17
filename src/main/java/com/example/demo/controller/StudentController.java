package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import java.util.*;


@RestController
public class StudentController {

    @Autowired
    StudentService ser;

    @PostMapping("/addStudents")
    public StudentEntity addStudents(@RequestBody StudentEntity student){
        return ser.addStudents(student);
    }
    
    @GetMapping("/getStudents")
    public List<StudentEntity> getStudents(){
        return ser.getStudents();
    }
    @GetMapping("/getStudents"/{id})
    public StudentEntity getStudentsById(@PathVariable long id){
        return ser.getStudentsById(id);
    }
}