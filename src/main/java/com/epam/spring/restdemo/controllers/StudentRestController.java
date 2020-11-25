package com.epam.spring.restdemo.controllers;

import com.epam.spring.restdemo.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents(){

        List<Student> students = new ArrayList<>();

        students.add(new Student("Stas", "Ivanov"));
        students.add(new Student("Alina", "Burdukova"));

        return students;
    }
}