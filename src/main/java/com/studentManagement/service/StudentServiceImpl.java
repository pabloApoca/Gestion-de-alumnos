package com.studentManagement.service;

import com.studentManagement.exceptions.ModelNotFoundException;
import com.studentManagement.exceptions.StudentNotFoundException;
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
        if (studentRepository.findStudentByDni(student.getDni())!=null)
            throw new ModelNotFoundException("El estudiante con DNI: " + student.getDni() + " ya exite");

        return studentRepository.save(student);
    }


    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public Student getStudentByDni(String dni) {
        Student s = studentRepository.findStudentByDni(dni);
        if(s == null)
            throw new ModelNotFoundException("El estudiante con DNI: "+ dni +" no existe.");

        return s;
    }


    @Override
    public void deleteStudentByDni(String dni) {
        Student s = studentRepository.findStudentByDni(dni);
        if(s == null)
            throw new StudentNotFoundException(dni);

        studentRepository.delete(s);
    }


    @Override
    public List<Student> getListStudents() {
        return studentRepository.findAll();
    }


}
