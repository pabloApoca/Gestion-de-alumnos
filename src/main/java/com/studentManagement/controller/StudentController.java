package com.studentManagement.controller;

import com.studentManagement.model.Student;
import com.studentManagement.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    IStudentService studentService;

    @PostMapping("create-student")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

}
