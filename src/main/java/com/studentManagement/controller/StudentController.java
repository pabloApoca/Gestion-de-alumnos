package com.studentManagement.controller;

import com.studentManagement.model.Student;
import com.studentManagement.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    IStudentService studentService;

    @PostMapping("create-student")
    public ResponseEntity<Student>  createStudent(@RequestBody Student student){
        return new ResponseEntity<>(studentService.createStudent(student), HttpStatus.CREATED);
    }

    @PutMapping("update-student")
    public Student updateStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    
    @GetMapping("get-sudent-by-dni")
    public Student getStudentByDni(@RequestParam("dni") String dni){
        return studentService.getStudentByDni(dni);
    }
    
    
    @GetMapping("list-students")
    public ResponseEntity<List<Student>>  listStudents(){
        return new ResponseEntity<>(studentService.getListStudents(), HttpStatus.OK);
    }


    @DeleteMapping("delete-student-by-dni")
    public void deleteStudent(@RequestParam("dni") String dni){
        studentService.deleteStudentByDni(dni);
    }




}
