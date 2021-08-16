package com.studentManagement.exceptions;

import lombok.Data;

@Data
public class ApiException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private final String code;
    private final String description;

}
