package com.studentManagement.exceptions;

public class StudentNotFoundException extends ApiException{

    public StudentNotFoundException(String dni) {
        super("StudentNotFoundException", "The Student with DNI: " + dni + " doesn't exist", 404);
    }
}
