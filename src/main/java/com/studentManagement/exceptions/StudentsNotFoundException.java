package com.studentManagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentsNotFoundException extends ApiException{

    public StudentsNotFoundException() {
        super("StudentsNotFoundException", "The student list is empty");
    }
}
