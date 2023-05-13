package com.capmu.basicauth.controller;

import com.capmu.basicauth.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>();

    @GetMapping("/students")
    public List<Student> getStudents() {

        Student student1 = Student
                .builder()
                .id(1)
                .firstName("Ramesh")
                .lastName("Fatadare")
                .build();

        Student student2 = Student
                .builder()
                .id(2)
                .firstName("Ram")
                .lastName("Jadhav")
                .build();

        students.add(student1);
        students.add(student2);

        return students;
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }
}
