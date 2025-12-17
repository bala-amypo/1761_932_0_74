package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class StudentEntity{
    @Id;
    @GeneratedValue(strategy=GenerationType.INDENTITY)
    private Long sid;
    private String sname;
    private String semail;
    private String spass;
   
}