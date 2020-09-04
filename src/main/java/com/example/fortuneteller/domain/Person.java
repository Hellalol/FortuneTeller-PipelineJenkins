package com.example.fortuneteller.domain;

import lombok.Data;

@Data
public class Person {
    private String name;
    private String nationality;
    private int age;
    private String gender;

    public Person(String name, String nationality, int age, String gender) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.gender = gender;
    }

}
