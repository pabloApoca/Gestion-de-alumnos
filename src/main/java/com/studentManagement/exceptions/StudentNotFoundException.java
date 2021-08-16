package com.studentManagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentNotFoundException extends ApiException{

    public StudentNotFoundException(String dni) {
        super("StudentNotFoundException", "The Student with DNI: " + dni + " doesn't exist");
    }
}
