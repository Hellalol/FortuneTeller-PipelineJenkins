package com.example.fortuneteller.service;

import com.example.fortuneteller.domain.CheesySentence;
import com.example.fortuneteller.domain.Person;
import com.example.fortuneteller.domain.Words;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class FortuneServiceTest {

    @Autowired
    private FortuneService fortuneService;

    @Test
    void getIntByNameTest(){
        Person person = new Person("Fredrik","Svensk",29,"male");
        int nameNumber = fortuneService.processName(person);

        Assertions.assertEquals(nameNumber,6);
        Assertions.assertNotEquals(nameNumber,0);
        Assertions.assertNotNull(person);
    }

    @Test
    void processAgeTest(){
        Person person = new Person("Fredrik","Svensk",29,"male");
        int ageNumber = fortuneService.processAge(person);
        Assertions.assertEquals(ageNumber,29);
        Assertions.assertNotEquals(ageNumber,0);
        Assertions.assertNotNull(person);
    }

    @Test
    void processNationalityTest(){
        Person person = new Person("Fredrik","Svensk",29,"male");
        for (int i = 0; i < 1000; i++) {
            int nationalityNumber = fortuneService.processNationality(person);
            Assertions.assertTrue(nationalityNumber > 0 &&  nationalityNumber < 229);
        }

    }

    @Test
    void random1to29Test(){
        for (int i = 0; i < 1000; i++) {
            int randomInt = fortuneService.random1to29();
            Assertions.assertTrue(randomInt > 0 && randomInt < 30);
        }
    }
    @Test
    void random1to228Test(){
        for (int i = 0; i < 1000; i++) {
            int randomInt = fortuneService.random1to29();
            Assertions.assertTrue(randomInt > 0 && randomInt < 229);
        }
    }

    @Test
    void getRandomQuoteTest(){
       String randQuote = fortuneService.getRandomQuote();
       Assertions.assertNotNull(randQuote);
       Assertions.assertTrue(randQuote instanceof String);

    }

    @Test
    void findSentenceByIdTest(){
       Optional<CheesySentence> sentence = fortuneService.findSentenceById(1);
       Assertions.assertNotNull(sentence);
       Assertions.assertEquals(sentence.get().getSentence(),"\"Your time is limited, so dont waste it living someone elses life. Dont be trapped by dogma – which is living with the results of other peoples thinking.\" -Steve Jobs");
    }

    @Test
    void findWordByIdTest(){
        Optional<Words> word = fortuneService.findWordById(1);
        Assertions.assertNotNull(word);
        Assertions.assertEquals(word.get().getWord(),"Bad");
    }

    @Test
    void processGenderTest(){
        Person person1 = new Person("Fredrik","Svensk",29,"male");
        Person person2 = new Person("Jenny","Finsk",25,"female");
        Person person3 = new Person("Fido","Svensk",12,"other");
        int gendernr = fortuneService.processGender(person1);
        Assertions.assertEquals(person1.getGender(),"male");
        Assertions.assertEquals(gendernr,1);

        gendernr = fortuneService.processGender(person2);
        Assertions.assertEquals(person2.getGender(),"female");
        Assertions.assertEquals(gendernr,2);

        gendernr = fortuneService.processGender(person3);
        Assertions.assertEquals(person3.getGender(),"other");
        Assertions.assertEquals(gendernr,3);

    }

    @Test
    void buildSentenceTest(){
        Person person1 = new Person("Fredrik","Svensk",29,"male");
        String sentence = fortuneService.buildSentence(person1);
        Assertions.assertTrue(sentence.startsWith("Your future"));
        Assertions.assertEquals(sentence.substring(20,24),"Busy");

        Person person2 = new Person("Jenny","Finsk",25,"female");
        sentence = fortuneService.buildSentence(person2);
        Assertions.assertEquals(sentence.substring(20,24),"Dead");

        Person person3 = new Person("Bob","Finsk",200,"other");
        int ageGender = person3.getAge() + fortuneService.processGender(person3);
        Assertions.assertEquals(ageGender,203);

    }

}
