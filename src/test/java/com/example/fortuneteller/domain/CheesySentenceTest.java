package com.example.fortuneteller.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CheesySentenceTest {

    CheesySentence cheesySentence;

    @Test
    void getIdTest() {
        System.out.println(cheesySentence.getSentence());
    }
}