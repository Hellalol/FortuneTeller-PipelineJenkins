package com.example.fortuneteller.service;

import com.example.fortuneteller.domain.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FortuneServiceTest {

    @Autowired
    private FortuneService fortuneService;

    @Test
    @DisplayName("test correct int by name")
    void getIntByNameTest(){
        Person person = new Person("Fredrik","Svensk",29,"male");
        int nameNumber = fortuneService.processName(person);

        Assertions.assertEquals(nameNumber,6);
        Assertions.assertNotEquals(nameNumber,0);
        Assertions.assertNotNull(person);
    }

    @Test
    @DisplayName("test age number")
    void processAgeTest(){
        Person person = new Person("Fredrik","Svensk",29,"male");
        int ageNumber = fortuneService.processAge(person);
        Assertions.assertEquals(ageNumber,29);
        Assertions.assertNotEquals(ageNumber,0);
        Assertions.assertNotNull(person);
    }

    @Test
    @DisplayName("test nationality number")
    void processNationalityTest(){
        Person person = new Person("Fredrik","Svensk",29,"male");
        for (int i = 0; i < 1000; i++) {
            int nationalityNumber = fortuneService.processNationality(person);
            Assertions.assertTrue(nationalityNumber > 0 &&  nationalityNumber < 229);
        }

    }


}
