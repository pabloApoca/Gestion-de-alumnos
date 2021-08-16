package com.studentManagement.exceptions;

public class StudentsNotFoundException extends ApiException{

    public StudentsNotFoundException() {
        super("StudentsNotFoundException", "The student list is empty", 404);
    }
}
