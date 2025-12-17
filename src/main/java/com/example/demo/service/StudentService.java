package com.example.demo.service;

import java.util.*;
import com.example.demo.entity.StudentEntity;

public interface StudentService {

    public StudentEntity addStudents(StudentEntity student);

    public List<StudentEntity> getStudents();

    public StudentEntity getStudentsById(Long id);

    public StudentEntity deleteStudentById(Long id);

}