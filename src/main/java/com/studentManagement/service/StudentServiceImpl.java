package com.studentManagement.service;

import com.studentManagement.model.Student;
import com.studentManagement.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
    IStudentRepository studentRepository;


    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public Student getStudentByDni(String dni) {
        return studentRepository.findStudentByDni(dni);
    }


    @Override
    public void deleteStudentByDni(String dni) {
        studentRepository.delete(getStudentByDni(dni));
    }


    @Override
    public List<Student> getListStudents() {
        return studentRepository.findAll();
    }


}
