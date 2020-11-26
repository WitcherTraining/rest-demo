package com.epam.spring.restdemo.controllers;

import com.epam.spring.restdemo.domain.Student;
import com.epam.spring.restdemo.exceptions.StudentNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    public void loadData() {
        students = new ArrayList<>();
        students.add(new Student("Stas", "Ivanov"));
        students.add(new Student("Alina", "Burdukova"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        if (studentId >= students.size() || studentId < 0) {
            throw new StudentNotFoundException("Student ID not found " + studentId);
        }

        return students.get(studentId);
    }
}
