package com.studentManagement.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table (name = "students")
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String dni;


}
