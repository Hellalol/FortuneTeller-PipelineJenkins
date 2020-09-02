package com.example.fortuneteller.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Person {

    private String fullName;
    private String nationality;
    private String etnicity;
    private Date birthdate;
    private String gender;

}
