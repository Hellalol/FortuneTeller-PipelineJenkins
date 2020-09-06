package com.example.fortuneteller.controller;

import com.example.fortuneteller.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
public class FortuneControllerRestTest {

    @Autowired
    FortuneControllerRest fortuneControllerRest;

    @Test
    void submitInfoTest() {
        Person person1 = new Person("Fredrik","Svensk",29,"male");
        Map<String,String> info = fortuneControllerRest.submitInfo(person1.getName(),person1.getAge(),person1.getNationality(),person1.getGender());
        System.out.println();
        Assertions.assertTrue(info.get("message").startsWith("Your future will be Busy"));
    }
}
