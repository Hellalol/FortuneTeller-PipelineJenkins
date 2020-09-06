package com.example.fortuneteller.service;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.logging.Logger;

//import static org.junit.Assert.assertEquals;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TranslatorTest {

    @InjectMocks
    Translator translator;

    public static final Logger log = Logger.getLogger(Translator.class.getName());

    @Test
    void getRandomQuote() {
//        String emptyString = "";
//        log.info(translator.getRandomQuote());
//        String randomString = translator.getRandomQuote();
//        assertNotEquals(emptyString, randomString);
    }


    @Test
    void firstletterToInt() {
     //   int maxValue = translator.getAlphabetList().size();
       // log.info(String.valueOf(translator.getAlphabetList().size()));
        //assertEquals(1, translator.firstletterToInt("a"));
       // assertEquals(maxValue, translator.firstletterToInt("ö"));
    }

    @Test
    void processPerson() {
//        Person person1 = new Person("anders", "usa", 201, "male");
////        Person person2 = new Person("anders", "usa", 50, "male");
////        Person person3 = new Person("östrid", "sweden", 404, "female");
////        Person person4 = new Person("östrid", "sweden", 5, "female");
////        Person person5 = new Person("zebra", "usa", 1337, "malefe");
////        Person person6 = new Person("zebra", "usa", 5, "malefe");
//
//        assertEquals("Your future will be Bad and possibly clean and sparkling", translator.processPerson(person1));


    }
}