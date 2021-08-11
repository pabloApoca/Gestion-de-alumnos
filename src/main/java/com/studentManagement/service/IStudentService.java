package com.studentManagement.service;

import com.studentManagement.model.Student;

import java.util.List;

public interface IStudentService {

    Student createStudent (Student student);

    Student updateStudent (Student student);

    Student getStudentByDni (String dni);

    void deleteStudentByDni (String dni);

    List<Student> getListStudents ();
}
