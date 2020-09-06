package com.example.fortuneteller.domain;

public class Person {
    private final String name;
    private final String nationality;
    private final int age;
    private final String gender;

    public Person(String name, String nationality, int age, String gender) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

}
